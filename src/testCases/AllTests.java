package testCases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AssignmentTest.class, ClassCourseListTest.class, CourseIteratorTest.class, CourseTest.class,
		ListIteratorTest.class, SolutionIteratorTest.class, SolutionTest.class, TestLogin.class })
public class AllTests {

}
