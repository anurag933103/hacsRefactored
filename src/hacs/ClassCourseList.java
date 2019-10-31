package hacs;

import java.util.ArrayList;
import java.io.*;

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

@SuppressWarnings("serial")
public class ClassCourseList extends ArrayList<Course> {

	public ClassCourseList() {
	}

	String courseFile = "CourseInfo.txt";
	//// initialize the list by reading from the file.
	@SuppressWarnings("resource")
	void initializeFromFile(String theFileName) {
		try {
			BufferedReader file;
			String strCourseName = null;
			file = new BufferedReader(new FileReader(courseFile));
			while ((strCourseName = file.readLine()) != null) {
				Course theCourse;
				theCourse = new Course(strCourseName, 0);
//      theCourse.CourseName= strCourseName;
				add(theCourse);
			}
		} catch (Exception ee) {
			;
		}
	}

	Course FindCourseByCourseName(String CourseName) {
		int nCourseCount = size();
		for (int i = 0; i < nCourseCount; i++) {
			Course theCourse;
			theCourse = (Course) get(i);
			if (theCourse.courseName.compareTo(CourseName) == 0)
				return theCourse;
		}
		return null;
	}

}