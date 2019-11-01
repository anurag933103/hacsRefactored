package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import hacs.Assignment;
import hacs.Solution;
import hacs.SolutionList;

class TestAssignment {

	@Test
	void testAddAssignment() {
		Assignment assignment = new Assignment();
		assignment.addSolution(new Solution());
		SolutionList solutionList = assignment.getTheSolutionList();
		assertEquals(solutionList.size(), 1, "Testing if assignment is being added successfully");
	}
	
	@Test
	void testGetSolutionList() {
		Assignment assignment = new Assignment();
		SolutionList solutionList = assignment.getTheSolutionList();
		assertEquals(solutionList.getClass() == SolutionList.class, true, "Testing if assignment is being added successfully");
	}

	@Test
	void testIsOverDue() {
		Assignment assignment = new Assignment();
		Long currentDate = System.currentTimeMillis();
		assignment.setDueDate(new Date(currentDate));
		boolean isOverDue = assignment.isOverDue();
		assertFalse(isOverDue, "Testing if current time as due for assignment returns false for isOverDue");
	}

	@Test
	void testDateFormat() {
		Assignment assignment = new Assignment();
		Long currentDate = 1572460124332l;
		assignment.setDueDate(new Date(currentDate));
		String dueDateString = assignment.getDueDateString();
		assertEquals(dueDateString, "10/30/19", "Testing if due date is formatted to its equivalent string properly");
	}
	
	/*
	 * @Test void testGetSolution() { Assignment assignment = new Assignment();
	 * Solution solution = new Solution(); solution.setTheAuthor("akhilesh");
	 * assignment.addSolution(solution); Solution sampleSolution =
	 * assignment.getSolution("akhilesh"); assertNotNull(sampleSolution,
	 * "Testing if solution is added properly and returning a not null value while fetching it"
	 * ); }
	 */
}
