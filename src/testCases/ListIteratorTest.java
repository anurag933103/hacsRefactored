package testCases;

import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

import hacs.ListIterator;

    public class ListIteratorTest {

	@Test
	public void testHasNext() {
		ArrayList<Object> list = new ArrayList<>();
		ListIterator itr = new ListIterator(list);
		assertFalse(itr.hasNext());
		list.add(1);
		assertTrue(itr.hasNext());
		
	}
	
	@Test
	public void testNext() {
		ArrayList<Object> list = new ArrayList<>();
		ListIterator itr = new ListIterator(list);
		list.add(1);
		assertEquals(itr.next(), 1);
	}
	
	@Test
	public void testremove() {
		ArrayList<Object> list = new ArrayList<>();
		list.add(1);
		ListIterator itr = new ListIterator(list);
		itr.remove();
		assertEquals(itr.hasNext(),false);
	}

}
