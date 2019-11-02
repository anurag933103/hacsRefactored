package testCases;

import static org.junit.Assert.*;


import org.junit.Test;

import hacs.Solution;

import hacs.SolutionIterator;
import hacs.SolutionList;

public class SolutionIteratorTest {

	@Test
	public void hasNextSolutionTest() {
		
		SolutionList solnList = new SolutionList();
		Solution soln = new Solution();
		SolutionIterator itr = new SolutionIterator(solnList);
		assertFalse(itr.hasNext());
		solnList.add(soln);
		assertTrue(itr.hasNext());
	}
	
	@Test
	public void nextSolutionTest() {
		
		SolutionList solnList = new SolutionList();
		Solution soln = new Solution();
		soln.setTheAuthor("Anurag");
		solnList.add(soln);
		SolutionIterator itr = new SolutionIterator(solnList);

		assertEquals(itr.next().getTheAuthor(),"Anurag");
	}

	@Test
	public void removeSolutionTest() {
		
		SolutionList solnList = new SolutionList();
		Solution soln = new Solution();
		soln.setTheAuthor("Anurag");
		solnList.add(soln);
		SolutionIterator itr = new SolutionIterator(solnList);
        itr.remove();
        
        assertEquals(itr.hasNext(),false);
	}
}
