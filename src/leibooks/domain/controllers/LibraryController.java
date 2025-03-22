package leibooks.domain.controllers;

import java.util.List;
import java.util.Optional;

import leibooks.domain.core.ILibrary;
import leibooks.domain.facade.DocumentProperties;
import leibooks.domain.facade.IDocument;
import leibooks.domain.facade.ILibraryController;
import leibooks.domain.facade.events.DocumentEvent;
import leibooks.domain.facade.events.LBEvent;
import leibooks.utils.Listener;

public class LibraryController implements ILibraryController{

	public LibraryController(ILibrary library) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void emitEvent(LBEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerListener(Listener<LBEvent> obs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterListener(Listener<LBEvent> obs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processEvent(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<IDocument> getDocuments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<IDocument> importDocument(String title, String pathTofile) {
		// TODO Auto-generated method stub
		return Optional.empty();
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
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("Library = \n");
//		for (IDocument doc: TO COMPLETE AND UNCOMMENT THIS CODE) {
//			result.append(doc + "\n");
//		}
		return result + "\n";

	}
	
}
