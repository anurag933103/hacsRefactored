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

public class Hacs {

	static Facade theFacade = new Facade();

	public Hacs() {
	}

	public static void main(String[] args) {
//		String strUsername;
//		String strUserType = null;
		UserInfoItem userinfoitem = new UserInfoItem();
		theFacade.createCourseList();
		while (true) {
			boolean bExit = false;
			bExit = theFacade.login(userinfoitem);
			if (bExit)
				break;
			// userinfoitem.strUserName = "Inst1";
			// userinfoitem.UserType = 1;
			theFacade.createUser(userinfoitem);
			theFacade.attachCourseToUser();
			if (userinfoitem.userType == UserInfoItem.UserType.STUDENT) // if is a student remind him of the due date
				theFacade.remind();
			boolean bLogout = false;
			while (!bLogout) {
				bLogout = theFacade.selectCourse();
				if (bLogout)
					break;
				bLogout = theFacade.courseOperation();
			}
		}
//    System.out.println(userinfoitem.strUserName +userinfoitem.UserType );
	}
}