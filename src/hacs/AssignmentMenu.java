package hacs;

import javax.swing.*;

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
abstract public class AssignmentMenu extends JDialog {
	abstract void showMenu(Assignment ass, Person per);

	public AssignmentMenu() {
		setModal(true);
		setSize(575, 330);
	}
}