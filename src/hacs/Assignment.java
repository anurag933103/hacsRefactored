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

import java.util.*;
import java.text.DateFormat;

public class Assignment {

	protected String AssName;
	protected String strAssignmentFilename;
	protected Date DueDate = new Date();
	protected String AssSpec;
	protected SolutionList theSolutionList = new SolutionList();
	protected Solution SuggestSolution = new Solution();

	public Assignment() {
	}

	public void SetDueDate(Date theDueDate) {
		this.DueDate = theDueDate;
	}

	public void SetAssSpec(String theSpec) {
		this.AssSpec = theSpec;
	}

	public boolean IsOverDue() {
		Date today = new Date();
		if (today.after(this.DueDate)) {
			return true;
		} else {
			return false;
		}
	}

	public Solution AddSolution() {
		Solution mySolution = new Solution();
		return mySolution;
	}

	//// add the theSolution to the Solutionlist
	public void AddSolution(Solution theSolution) {
		theSolutionList.add(theSolution);
	}

	public void SubmitSolution() {
	}

	public void getSolutionList() {
	}

	/*
	 * return the solution of the give name
	 */
	public Solution getSolution(String studentname) {
		SolutionIterator Iterator = (SolutionIterator) theSolutionList.iterator();
		return (Solution) Iterator.next(studentname);
	}

	public Solution getSugSolution() {
		return SuggestSolution;
	}

	public SolutionIterator GetSolutionIterator() {
		SolutionIterator theSolutionIterator = new SolutionIterator(theSolutionList);
		return theSolutionIterator;
	}

	public String toString() {
		return AssName;
	}

	public String getDueDateString() {
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		return dateFormat.format(DueDate);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visitAssignment(this);
	}
}