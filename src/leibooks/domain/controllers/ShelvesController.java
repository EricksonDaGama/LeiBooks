package leibooks.domain.controllers;

import java.util.function.Predicate;

import javax.naming.OperationNotSupportedException;

import leibooks.domain.facade.IDocument;
import leibooks.domain.facade.IShelvesController;
import leibooks.domain.facade.events.LBEvent;
import leibooks.domain.facade.events.ShelfEvent;
import leibooks.domain.shelves.IShelves;
import leibooks.utils.Listener;


public class ShelvesController implements IShelvesController {


	public ShelvesController(IShelves shelves) {
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
	public void processEvent(ShelfEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addNormalShelf(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addSmartShelf(String name, Predicate<IDocument> criteria) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<String> getShelves() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(String name) throws OperationNotSupportedException {
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
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("Shelves=\n");
//		for (IShelf s: COMPLETE ME AND UNCOMMENT THIS CODE) {
//			result.append(s + "= [");
//			StringBuilder shelfInfo = new StringBuilder("");
//			for (IDocument d: s)
//				shelfInfo.append(d.getFile() + ", ");
//			if (shelfInfo.length() == 0)
//				result.append("] \n");
//			else
//				result.append(shelfInfo.substring(0, shelfInfo.length() - 2) + "]\n");
//		}
		return result + "\n";
	}

}
