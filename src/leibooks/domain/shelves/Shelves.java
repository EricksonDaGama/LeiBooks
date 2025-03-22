package leibooks.domain.shelves;

import java.util.Iterator;
import java.util.function.Predicate;

import javax.naming.OperationNotSupportedException;

import leibooks.domain.core.ILibrary;
import leibooks.domain.facade.IDocument;
import leibooks.domain.facade.events.ShelfEvent;
import leibooks.utils.Listener;

public class Shelves implements IShelves {

	public Shelves(ILibrary library) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Iterator<IShelf> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void emitEvent(ShelfEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerListener(Listener<ShelfEvent> obs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterListener(Listener<ShelfEvent> obs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addNormalShelf(String shelfName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addSmartShelf(String shelfName, Predicate<IDocument> criteria) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeShelf(String shelfName) throws OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeDocument(String shelfName, IDocument document) throws OperationNotSupportedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addDocument(String shelfName, IDocument document) throws OperationNotSupportedException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<IDocument> getDocuments(String shelfName) {
		// TODO Auto-generated method stub
		return null;
	}
}
