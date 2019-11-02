package testCases;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import hacs.Assignment;
import hacs.Solution;
import hacs.SolutionList;

	public class AssignmentTest {

		@Test
		public void testAddAssignment() {
			Assignment assignment = new Assignment();
			assignment.addSolution(new Solution());
			SolutionList solutionList = assignment.getTheSolutionList();
			assertEquals(solutionList.size(), 1);
		}
		
		@Test
		public void testGetSolutionList() {
			Assignment assignment = new Assignment();
			SolutionList solutionList = assignment.getTheSolutionList();
			assertEquals(solutionList.getClass() == SolutionList.class, true);
		}

		@Test
		public void testIsOverDue() {
			Assignment assignment = new Assignment();
			Long currentDate = System.currentTimeMillis();
			assignment.setDueDate(new Date(currentDate));
			boolean isOverDue = assignment.isOverDue();
			assertFalse(isOverDue);
		}

		@Test
		public void testDateFormat() {
			Assignment assignment = new Assignment();
			System.out.println(System.currentTimeMillis());
			Long currentDate = 1572668870172l;
			assignment.setDueDate(new Date(currentDate));
			String dueDateString = assignment.getDueDateString();
			assertEquals(dueDateString, "11/1/19");
		}
		
		
		  @Test 
		  public void testGetSolution() { 
		  Assignment assignment = new Assignment();
		  Solution solution = new Solution(); 
		  solution.setTheAuthor("anurag");
		  assignment.addSolution(solution); 
		  Solution sampleSolution = assignment.getSolution("anurag"); 
		  assertNotNull(sampleSolution); 
		  }
		  
		 
	}


