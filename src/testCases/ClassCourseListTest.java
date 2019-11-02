package testCases;

import static org.junit.Assert.*;

import org.junit.Test;

import hacs.ClassCourseList;
import hacs.Course;

   public class ClassCourseListTest {

	  @Test 
	  public void testFindCourseByCourseName() 
	  { 
		  ClassCourseList list = new ClassCourseList(); 
		  list.initializeFromFile(); 
		  Course course =list.findCourseByCourseName("CSE870"); 
		  assertEquals(course.getCourseName(),"CSE870"); 
		  }
	 

}
