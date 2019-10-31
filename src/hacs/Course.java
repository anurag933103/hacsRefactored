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
	String CourseName;
	public ArrayList<Assignment> assignmentList = new ArrayList<Assignment>();
	int NumOfAss;
	int CourseLevel;

	public Course(String strCourse, int theLevel) {
		this.CourseName = strCourse;

		// 0 HighLeve presentation 1 LowLevel Experiment
		this.CourseLevel = theLevel;
		// this.AssList = NULL;
		this.NumOfAss = 0;
	}

	public void AddAssignment(Assignment newAss) {
		assignmentList.add(newAss);
	}

	public String toString() {
		return CourseName;
	}

	void accept(NodeVisitor visitor) {
		visitor.visitCourse(this);
	}

}