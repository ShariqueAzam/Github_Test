package gui;

import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 * This code was edited or generated using CloudGarden's Jigloo SWT/Swing GUI
 * Builder, which is free for non-commercial use. If Jigloo is being used
 * commercially (ie, by a corporation, company or business for any purpose
 * whatever) then you should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details. Use of Jigloo implies
 * acceptance of these licensing terms. A COMMERCIAL LICENSE HAS NOT BEEN
 * PURCHASED FOR THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED LEGALLY FOR
 * ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class LoggedIn extends javax.swing.JFrame {

	/**
	 * Auto-generated main method to display this JFrame
	 */

	public JTextField welcome;

	public LoggedIn() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{

				welcome = new JTextField();
				getContentPane().add(welcome);
				welcome.setBounds(0, 0, 345, 27);

			}
			pack();
			this.setSize(361, 244);
		} catch (Exception e) {
			// add your error handling code here
			e.printStackTrace();
		}

	}

}
