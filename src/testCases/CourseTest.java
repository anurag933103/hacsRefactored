package testCases;

import org.junit.Test;
import static org.junit.Assert.*;
import hacs.Assignment;
import hacs.Course;

    public class CourseTest {

	@Test
	public void testAddAssignment() {
		Course test = new Course("CSE870", 0);
		test.addAssignment(new Assignment());
		assertEquals(test.getAssignmentList().size(), 1);
	}

}
