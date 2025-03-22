package leibooks.domain.core;

import java.util.Iterator;
import java.util.List;

import leibooks.domain.facade.DocumentProperties;
import leibooks.domain.facade.IDocument;
import leibooks.domain.facade.events.DocumentEvent;
import leibooks.utils.Listener;

public class Library implements  ILibrary {

	@Override
	public Iterator<IDocument> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void emitEvent(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerListener(Listener<DocumentEvent> obs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterListener(Listener<DocumentEvent> obs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNumberOfDocuments() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean addDocument(IDocument document) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeDocument(IDocument document) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDocument(IDocument document, DocumentProperties documentProperties) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IDocument> getMatches(String regex) {
		// TODO Auto-generated method stub
		return null;
	}

}
