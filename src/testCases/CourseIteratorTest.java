package testCases;

import org.junit.Test;
import static org.junit.Assert.*;
import hacs.ClassCourseList;
import hacs.Course;
import hacs.CourseIterator;

    public class CourseIteratorTest {

	@Test
	public void testHasNext() {
		ClassCourseList list = new ClassCourseList();
		CourseIterator itr1 = new CourseIterator(list);
		assertFalse(itr1.hasNext());
		Course course1 = new Course("CSE870", 0);
		list.add(course1);
		CourseIterator itr2 = new CourseIterator(list);
		assertTrue(itr2.hasNext());

	}
	
	
	  @Test 
	  public void testNext() {
		  ClassCourseList list = new ClassCourseList(); 
		  Course course1 = new Course("CSE870", 0); 
	      list.add(course1); 
	      CourseIterator itr = new CourseIterator(list); 
	      assertEquals(itr.next().getCourseName(), "CSE870");
     }
	 
	
	
	  @Test 
	  public void testNextwithCourse() { 
		  ClassCourseList list = new ClassCourseList(); 
		  Course course = new Course("CSE870", 0);  
		  list.add(course);  
		  CourseIterator itr = new CourseIterator(list);
	      assertEquals(itr.next(course.getCourseName()).getCourseName(), "CSE870");
	  }
	  
	  @Test 
	  public void testRemoveCourse() { 
		  ClassCourseList list = new ClassCourseList(); 
		  Course course = new Course("CSE870", 0);  
		  list.add(course);  
		  CourseIterator itr = new CourseIterator(list);
		  itr.remove();
	      assertEquals(itr.hasNext(),false);
	  }
	 

}
