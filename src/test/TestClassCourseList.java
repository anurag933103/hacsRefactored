package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hacs.ClassCourseList;
import hacs.Course;

class TestClassCourseList {

	
	  @Test void testFindCourseByCourseName() { 
		  ClassCourseList list = new ClassCourseList(); 
		  list.initializeFromFile(); 
		  Course course =list.findCourseByCourseName("CSE870"); 
		  assertEquals(course.getCourseName(),"CSE870"); }
	 

}
