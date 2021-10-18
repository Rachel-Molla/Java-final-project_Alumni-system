package alumni_system_GUI;

import alumni_system_API.AlumniSystemManagement;
import alumni_system_API.AlumnusAccount;

import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SheCodesLoginPage extends JFrame implements ActionListener {	
	
	private Container container;
	
	private JLabel pageTitleLabel;
	
	private JLabel userIDLabel;
	private JTextField userIDField;

	private JLabel userPasswordLabel;	
	private JPasswordField userPasswordField;

	private JCheckBox showPassword;
	
	private JButton loginButton;
	private JButton resetButton;
	
	private JLabel messageLabel;
	
	private JLabel messageFirstEnteryLabel;
	private JButton signupButton;
	
	AlumniSystemManagement systemManagerCopy;
	ArrayList<AlumnusAccount> alumniAccountsCopy;
	String[] sheCodesCoursesListCopy;

	
	SheCodesLoginPage(AlumniSystemManagement originalSystemManager) {
		
		systemManagerCopy= originalSystemManager;
		sheCodesCoursesListCopy = systemManagerCopy.getSheCodesCoursesList();
		setLayoutManager();
		addLocationAndSize();
		addComponentsToContainer();
		addActionEvent();
		
	}

	void setLayoutManager() {
		
		setTitle("Login Form");
		setBounds(10, 10, 370, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLayout(null);
		//setSize(420, 420);
		//setResizable(true);

		container = getContentPane();
		container.setLayout(null);
		
		pageTitleLabel = new JLabel("She-codes; Alumni system");
				
		userIDLabel = new JLabel("userID:");
		userIDField = new JTextField();

		userPasswordLabel = new JLabel("password:");
		userPasswordField = new JPasswordField();
		
		showPassword = new JCheckBox("Show password");
		showPassword.setFocusable(false);
		
		loginButton = new JButton("Login");
		loginButton.setFocusable(false);
		
		resetButton = new JButton("Reset");
		resetButton.setFocusable(false);
						
		messageLabel = new JLabel("This is a text");		
		
		messageFirstEnteryLabel = new JLabel("New here?");
		signupButton = new JButton("Sign-up");
		signupButton.setFocusable(false);

		setVisible(true);

		
	}
	
	void addLocationAndSize() {
		
		pageTitleLabel.setBounds(100, 30, 300, 30);
		userIDLabel.setBounds(50, 100, 75, 25);
		userIDField.setBounds(125, 100, 200, 25);
		userPasswordLabel.setBounds(50, 150, 75, 25);
		userPasswordField.setBounds(125, 150, 200, 25);
		showPassword.setBounds(125, 200, 200, 25);
		loginButton.setBounds(100, 250, 100, 25);
		resetButton.setBounds(200, 250, 100, 25);
		messageLabel.setBounds(125, 300, 250, 35);		
		messageFirstEnteryLabel.setBounds(125, 350, 250, 35);
		signupButton.setBounds(200, 350, 100, 25);
			
	}
	
	void addComponentsToContainer() {
		
		container.add(pageTitleLabel);
		container.add(userIDLabel);
		container.add(userIDField);
		container.add(userPasswordLabel);
		container.add(userPasswordField);
		container.add(showPassword);
		container.add(loginButton);
		container.add(resetButton);	
		container.add(messageLabel);
		container.add(messageFirstEnteryLabel);
		container.add(signupButton);
		
	}
	
	void addActionEvent() {

		loginButton.addActionListener(this);
		resetButton.addActionListener(this);
		signupButton.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == resetButton) {	
			userIDField.setText("");
			userPasswordField.setText("");
		}
		if(e.getSource() == loginButton) {
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			checkIDandPasswordFields(userID, password);
		}
		if(e.getSource() == signupButton) {
			dispose();
			new SignupPage();
		}
	}
	
	void checkIDandPasswordFields(String userID, String password){

		if(systemManagerCopy.checkUserIDandPassword(userID, password)) {
			dispose();
			new AccountPage(systemManagerCopy.alumnusAccessHisAccount(password), sheCodesCoursesListCopy);
		} 
		else {
			messageLabel.setForeground(Color.red);
			messageLabel.setText("username not found or wrong password");
		}

	}
	
}
