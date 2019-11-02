package testCases;

import static org.junit.Assert.*;

import org.junit.Test;
import hacs.Login;
import hacs.UserInfoItem;

public class TestLogin {

	@Test
		public void getUsernameTest() {
			Login login = new Login();
			String text = "pepe:1111";
			String result = login.getUserName(text);
			assertTrue(result.equals("pepe"));
		}
		
		@Test
		public void getPassword() {
			Login login = new Login();
			String text = "pepe:1111";
			String result = login.getPassword(text);
			assertTrue(result.equals("1111"));
		}
		
		@Test
		public void userTypeTest() {
			UserInfoItem.UserType type;
			type =UserInfoItem.UserType.STUDENT;
			assertFalse(type == UserInfoItem.UserType.INSTRUCTOR);
		}
	

}
