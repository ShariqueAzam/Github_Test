package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
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
public class NewJFrame extends javax.swing.JFrame {
	private JLabel passLabel;
	private JButton loginLabel;
	private JButton resetLabel;
	private JPasswordField passTextField;
	public JTextField userTextField;
	private JLabel userLabel;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewJFrame inst = new NewJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setTitle("Club Management System");

			}
		});
	}

	public NewJFrame() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				userLabel = new JLabel();
				getContentPane().add(userLabel);
				userLabel.setText("UserName");
				userLabel.setLayout(null);
				userLabel.setBounds(64, 40, 73, 16);
			}
			{
				userTextField = new JTextField();
				getContentPane().add(userTextField);
				userTextField.setBounds(149, 33, 162, 23);
			}
			{
				passLabel = new JLabel();
				getContentPane().add(passLabel);
				passLabel.setLayout(null);
				passLabel.setBounds(64, 68, 73, 10);
				passLabel.setText("Password");
			}
			{
				passTextField = new JPasswordField(5);
				getContentPane().add(passTextField);
				passTextField.setBounds(149, 68, 162, 23);
			}
			{
				loginLabel = new JButton();
				getContentPane().add(loginLabel);
				loginLabel.setText("SignIn");
				loginLabel.setLayout(null);
				loginLabel.setBounds(149, 102, 78, 23);
				loginLabel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						String uname = userTextField.getText();
						String pword = passTextField.getText();

						// System.out.println("userName" + uname);
						// System.out.println("password" + pword);

						if (pword.equals("12345")) {
							dispose();
							LoggedIn ln = new LoggedIn();
							ln.setTitle("Welcome");
							System.out.println("true");
							uname = userTextField.getText();
							ln.welcome.setText("Welcome " + uname);
							ln.setVisible(true);
						} else {
							String msg = "Please try again";
							JOptionPane.showMessageDialog(new JFrame(), msg,
									"Dialog", JOptionPane.ERROR_MESSAGE);
							resetLabelActionPerformed(evt);
						}

					}
				});
			}
			{
				resetLabel = new JButton();
				getContentPane().add(resetLabel);
				resetLabel.setText("Clear");
				resetLabel.setLayout(null);
				resetLabel.setBounds(238, 103, 69, 23);
				resetLabel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						resetLabelActionPerformed(evt);
					}
				});
			}
			pack();
			this.setSize(400, 187);
		} catch (Exception e) {
			// add your error handling code here
			e.printStackTrace();
		}
	}

	private void resetLabelActionPerformed(ActionEvent evt) {
		System.out.println("resetLabel.actionPerformed, event=" + evt);
		userTextField.setText("");
		passTextField.setText("");
	}

}
