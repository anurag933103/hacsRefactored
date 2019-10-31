package hacs;

import java.util.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 * @author amishr57
 * @version 3.0
 */

abstract public class Person {
	int type = 0; // type=0 : student, type=1 instructor
	String UserName;
	ClassCourseList CourseList;
	CourseMenu theCourseMenu;
	Course CurrentCourse;
	Assignment CurrentAssignment;

	public Person() {
		CourseList = new ClassCourseList();
	}

	abstract public CourseMenu CreateCourseMenu(Course theCourse, int theLevel);

	public void showAddButton() {
		theCourseMenu.ShowAddButtons();
	}

	public void showViewButtons() {
		theCourseMenu.ShowViewButtons();
	}

	public void showComboxes() {
		theCourseMenu.ShowComboxes();
	}

	public void showRadios() {
		theCourseMenu.ShowRadios();
	}

	public void show() {
		theCourseMenu.setVisible(true);
	}

	public boolean ifLogout() {
		return theCourseMenu.ifLogout();
	}

	// show the assignment list
	public boolean ShowMenu() {
		// create a iterator for the assignment list
//    Iterator theIter=new ListIterator(CurrentCourse.AssList );
		Iterator<Assignment> theIter = CurrentCourse.assignmentList.iterator();
		theCourseMenu.theCourse = CurrentCourse;
		Assignment theAssignment;
		while (theIter.hasNext()) {
			theAssignment = theIter.next();
			theCourseMenu.assignmentCombox.addItem(theAssignment);
		}
		return false;
	}

	public ClassCourseList GetCourseList() {
		return CourseList;
	}

	public void AddCourse(Course theCourse) {
		CourseList.add(theCourse);
	}
}