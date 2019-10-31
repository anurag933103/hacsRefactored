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
	String courseName;
	public ArrayList<Assignment> assignmentList = new ArrayList<Assignment>();
	int assignCount;
	int courseLevel;

	public Course(String strCourse, int theLevel) {
		this.courseName = strCourse;

		// 0 HighLeve presentation 1 LowLevel Experiment
		this.courseLevel = theLevel;
		// this.AssList = NULL;
		this.assignCount = 0;
	}

	public void AddAssignment(Assignment newAss) {
		assignmentList.add(newAss);
	}

	public String toString() {
		return courseName;
	}

	void accept(NodeVisitor visitor) {
		visitor.visitCourse(this);
	}

}