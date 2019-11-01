package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hacs.Assignment;
import hacs.Course;

class TestCourse {

	@Test
	void testAddAssignment() {
		Course test = new Course("CSE870", 0);
		test.addAssignment(new Assignment());
		assertEquals(test.getAssignmentList().size(), 1, "After adding an assignment to course");
	}

}
