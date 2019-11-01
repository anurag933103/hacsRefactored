package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hacs.ClassCourseList;
import hacs.Course;
import hacs.CourseIterator;

class TestCourseIterator {

	@Test
	void testHasNext() {
		ClassCourseList list = new ClassCourseList();
		CourseIterator itr1 = new CourseIterator(list);
		assertFalse(itr1.hasNext(), "Testing empty condition for iterator.");
		Course course1 = new Course("CSE870", 0);
		Course course2 = new Course("CSE890", 0);
		list.add(course1);
		list.add(course2);
		CourseIterator itr2 = new CourseIterator(list);
		assertTrue(itr2.hasNext(), "Testing empty condition for iterator.");

	}
	
	/*
	 * @Test void testNext() { ClassCourseList list = new ClassCourseList(); Course
	 * course1 = new Course("CSE870", 0); Course course2 = new Course("CSE890", 0);
	 * list.add(course1); list.add(course2); CourseIterator itr = new
	 * CourseIterator(list); assertEquals(itr.next().getCourseName(), "CSE870",
	 * "Testing if the course name of next value is same as the first added course"
	 * ); }
	 */
	
	/*
	 * @Test void testNextWithCourseNameParam() { ClassCourseList list = new
	 * ClassCourseList(); Course course1 = new Course("CSE870", 0); Course course2 =
	 * new Course("CSE890", 0); list.add(course1); list.add(course2); CourseIterator
	 * itr = new CourseIterator(list);
	 * assertEquals(itr.next(course2.getCourseName()).getCourseName(), "CSE890",
	 * "Testing if the returned course object has name same as the requested one");
	 * }
	 */

}
