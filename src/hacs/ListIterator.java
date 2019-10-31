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

public class ListIterator implements Iterator<Object> {
	ArrayList<Object> theList;
	int CurrentNumber = -1;

	public ListIterator() {
	}

	public ListIterator(ArrayList<Object> list) {
		this.theList = list;
	}

	public boolean hasNext() {
		if (CurrentNumber >= theList.size() - 1)
			return false;
		else
			return true;
	}

	public Object next() {
		if (hasNext() == true) {
			CurrentNumber++;
			return theList.get(CurrentNumber);
		} else {
			return null;
		}
	}

	public void remove() {
		theList.remove(CurrentNumber);
	}
}