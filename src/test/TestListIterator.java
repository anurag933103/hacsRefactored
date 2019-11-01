package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import hacs.ListIterator;

class TestListIterator {

	@Test
	void testHasNext() {
		ArrayList<Object> list = new ArrayList<>();
		ListIterator itr = new ListIterator(list);
		assertFalse(itr.hasNext(), "Testing for false before adding value to list");
		list.add(1);
		assertTrue(itr.hasNext(), "Testing for true after adding value to list");
		
	}
	
	@Test
	void testNext() {
		ArrayList<Object> list = new ArrayList<>();
		ListIterator itr = new ListIterator(list);
		list.add(1);
		assertEquals((Integer)itr.next(), 1, "Testing if value exists in list");
	}

}
