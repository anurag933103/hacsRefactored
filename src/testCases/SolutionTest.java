package testCases;

import static org.junit.Assert.*;

import org.junit.Test;
import hacs.Solution;

public class SolutionTest {

	@Test
	public void testSolutionValue() {
		
		Solution soln = new Solution();
		soln.setTheAuthor("Anurag");
		soln.setSolutionFileName("quiz");
	    soln.setTheGrade(1);
		String statement = soln.toString();
		assertEquals(statement,"Anurag  quiz Grade=1  not reported");
	}

}
