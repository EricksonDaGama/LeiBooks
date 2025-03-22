package leibooks.domain.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import leibooks.domain.facade.DocumentProperties;
import leibooks.domain.facade.IDocument;
import leibooks.domain.facade.events.DocumentEvent;
import leibooks.utils.Listener;

/**
 * Implementação da interface ILibrary para gerenciar os documentos da aplicação LEIBooks.
 * <p>
 * Essa classe armazena os documentos internamente e gerencia os listeners que são notificados
 * sempre que um evento relacionado a um documento ocorre (adição, remoção ou atualização).
 * </p>
 */
public class Library implements ILibrary {

	// Coleção interna para armazenar os documentos
	private List<IDocument> documents;

	// Lista de listeners para eventos de documento
	private List<Listener<DocumentEvent>> listeners;

	/**
	 * Construtor que inicializa as coleções de documentos e listeners.
	 */
	public Library() {
		documents = new ArrayList<>();
		listeners = new ArrayList<>();
	}

	/**
	 * Retorna um iterador para os documentos armazenados.
	 */
	@Override
	public Iterator<IDocument> iterator() {
		return documents.iterator();
	}

	/**
	 * Emite um evento para todos os listeners registrados.
	 *
	 * @param e o evento de documento a ser emitido
	 */
	@Override
	public void emitEvent(DocumentEvent e) {
		for (Listener<DocumentEvent> listener : listeners) {
			listener.update(e);
		}
	}

	/**
	 * Registra um listener para receber notificações de eventos de documento.
	 *
	 * @param obs o listener a ser registrado
	 */
	@Override
	public void registerListener(Listener<DocumentEvent> obs) {
		if (obs != null && !listeners.contains(obs)) {
			listeners.add(obs);
		}
	}

	/**
	 * Remove um listener da lista de notificações.
	 *
	 * @param obs o listener a ser removido
	 */
	@Override
	public void unregisterListener(Listener<DocumentEvent> obs) {
		listeners.remove(obs);
	}

	/**
	 * Retorna o número de documentos armazenados na biblioteca.
	 */
	@Override
	public int getNumberOfDocuments() {
		return documents.size();
	}

	/**
	 * Adiciona um documento à biblioteca.
	 * Caso a adição seja bem-sucedida, emite um evento do tipo ADD.
	 *
	 * @param document o documento a ser adicionado
	 * @return true se o documento for adicionado; false se o documento for nulo
	 */
	@Override
	public boolean addDocument(IDocument document) {
		if (document == null) {
			return false;
		}
		boolean added = documents.add(document);
		if (added) {
			emitEvent(new DocumentEvent(document, DocumentEvent.Type.ADD));
		}
		return added;
	}

	/**
	 * Remove um documento da biblioteca.
	 * Se a remoção ocorrer com sucesso, emite um evento do tipo REMOVE.
	 *
	 * @param document o documento a ser removido
	 */
	@Override
	public void removeDocument(IDocument document) {
		if (documents.remove(document)) {
			emitEvent(new DocumentEvent(document, DocumentEvent.Type.REMOVE));
		}
	}

	/**
	 * Atualiza as propriedades de um documento presente na biblioteca.
	 * Como a interface IDocument declara o método updateProperties(DocumentProperties properties),
	 * chamamos esse método para atualizar o documento e, em seguida, emitimos um evento do tipo UPDATE.
	 *
	 * @param document o documento a ser atualizado
	 * @param documentProperties as novas propriedades do documento
	 */
	@Override
	public void updateDocument(IDocument document, DocumentProperties documentProperties) {
		int index = documents.indexOf(document);
		if (index != -1) {
			documents.get(index).updateProperties(documentProperties);
			emitEvent(new DocumentEvent(document, DocumentEvent.Type.UPDATE));
		}
	}

	/**
	 * Retorna uma lista de documentos cujo título corresponde ao padrão regex informado.
	 *
	 * @param regex o padrão regex para buscar correspondências no título dos documentos
	 * @return lista de documentos que satisfazem o padrão
	 */
	@Override
	public List<IDocument> getMatches(String regex) {
		List<IDocument> matches = new ArrayList<>();
		Pattern pattern = Pattern.compile(regex);
		for (IDocument doc : documents) {
			if (pattern.matcher(doc.getTitle()).find()) {
				matches.add(doc);
			}
		}
		return matches;
	}
}
