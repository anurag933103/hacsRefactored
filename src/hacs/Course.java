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

public class Course {
	protected String courseName;
	protected ArrayList<Assignment> assignmentList = new ArrayList<Assignment>();
	protected int assignCount;
	protected int courseLevel;

	public Course(String strCourse, int theLevel) {
		this.courseName = strCourse;

		// 0 HighLeve presentation 1 LowLevel Experiment
		this.courseLevel = theLevel;
		// this.AssList = NULL;
		this.assignCount = 0;
	}

	public ArrayList<Assignment> getAssignmentList() {
		return assignmentList;
	}

	public void setAssignmentList(ArrayList<Assignment> assignmentList) {
		this.assignmentList = assignmentList;
	} 
	
	public void addAssignment(Assignment newAss) {
		getAssignmentList().add(newAss);
	}

	public String toString() {
		return courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	void accept(NodeVisitor visitor) {
		visitor.visitCourse(this);
	}

	public int getAssignCount() {
		return assignCount;
	}

	public void setAssignCount(int assignCount) {
		this.assignCount = assignCount;
	}
}