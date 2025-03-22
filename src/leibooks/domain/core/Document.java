package leibooks.domain.core;

import java.io.File;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import leibooks.domain.facade.IDocument;
import leibooks.domain.facade.events.AddAnnotationEvent;
import leibooks.domain.facade.events.DocumentEvent;
import leibooks.domain.facade.events.RemoveAnnotationEvent;
import leibooks.domain.facade.events.ToggleBookmarkEvent;
import leibooks.utils.AbsSubject;
import leibooks.utils.Listener;

public class Document implements IDocument {

	public Document(String expectedTitle, String expectedAuthor, LocalDate expectedModifiedDate,
			String expectedMimeType, String expectedPath, Optional<Integer> expectedNumPages) {
		// TODO Auto-generated constructor stub
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
	public File getFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMimeType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDate getLastModifiedDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Integer> getNumberOfPages() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int getLastPageVisited() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Integer> getBookmarks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void toggleBookmark(int pageNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAuthor(String author) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLastPageVisited(int lastPageVisited) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAnnotation(int pageNum, String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAnnotation(int pageNum, int annotNum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int numberOfAnnotations(int pageNum) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterable<String> getAnnotations(int pageNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAnnotationText(int pageNum, int annotNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasAnnotations(int pageNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBookmarked(int pageNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBookmarked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean matches(String regexp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int compareTo(IDocument other) {
		// TODO Auto-generated method stub
		return 0;
	}


}
