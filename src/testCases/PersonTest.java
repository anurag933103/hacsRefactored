package testCases;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import hacs.Person;
import hacs.Instructor;
import hacs.Student;
import hacs.Course;
import hacs.Assignment;
import hacs.CourseMenu;
import hacs.LowLevelCourseMenu;
import hacs.HighLevelCourseMenu;
public class PersonTest {

	@Test
	public void testPersonLowMenu() {

		Person stud = new Student();
		Course course = new Course("CSE870",1);
		Assignment assign = new Assignment();
		assign.setAssignName("abc");
		ArrayList<Assignment> assignList = new ArrayList<Assignment>();
		CourseMenu menu = new LowLevelCourseMenu();
		course.setAssignmentList(assignList);
		stud.setCurrentCourse(course);
		stud.setTheCourseMenu(menu);
		assertTrue(stud.showMenu());
	}
	
	@Test
	public void testPersonHighMenu() {

		Person stud = new Student();
		Course course = new Course("CSE870",0);
		Assignment assign = new Assignment();
		assign.setAssignName("abc");
		ArrayList<Assignment> assignList = new ArrayList<Assignment>();
		CourseMenu menu = new HighLevelCourseMenu();
		course.setAssignmentList(assignList);
		stud.setCurrentCourse(course);
		stud.setTheCourseMenu(menu);
		assertTrue(stud.showMenu());
	}
	
	@Test
	public void testInstructorLowMenu() {

		Person stud = new Instructor();
		Course course = new Course("CSE870",1);
		Assignment assign = new Assignment();
		assign.setAssignName("abc");
		ArrayList<Assignment> assignList = new ArrayList<Assignment>();
		CourseMenu menu = new LowLevelCourseMenu();
		course.setAssignmentList(assignList);
		stud.setCurrentCourse(course);
		stud.setTheCourseMenu(menu);
		assertTrue(stud.showMenu());
	}
	
	@Test
	public void testInstructorHighMenu() {

		Person stud = new Instructor();
		Course course = new Course("CSE870",0);
		Assignment assign = new Assignment();
		assign.setAssignName("abc");
		ArrayList<Assignment> assignList = new ArrayList<Assignment>();
		CourseMenu menu = new HighLevelCourseMenu();
		course.setAssignmentList(assignList);
		stud.setCurrentCourse(course);
		stud.setTheCourseMenu(menu);
		assertTrue(stud.showMenu());
	}
	

}
