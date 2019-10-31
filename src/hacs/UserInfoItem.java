package hacs;

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

public class UserInfoItem {

	public enum UserType {
		STUDENT, INSTRUCTOR
	}

	String strUserName;
	UserType userType; // 0 : Student, 1: Instructor
}