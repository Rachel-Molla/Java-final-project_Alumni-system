package alumni_system_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SignupPage extends JFrame implements ActionListener{

	private Container container;
	
	private JButton backToLoginPageButton;
	private JLabel pageTitleLabel;
		
	private JLabel userFirstNameLabel;
	private JTextField userFirstNameField;
	private JLabel userLastNameLabel;
	private JTextField userLastNameField;
	private JButton sendOTPButton;
	
	private JLabel userOTPLabel;
	private JPasswordField userOTPField;
	private JCheckBox showPassword;
	private JButton submitOTPButton;
	
	private JLabel permanentPasswordLabel;
	private JPasswordField permanentPasswordField;
	private JButton signinButton;

	private JLabel messageLabel;
	
	
	SignupPage() {

		setLayoutManager();
		addLocationAndSize();
		addComponentsToContainer();
		addActionEvent();
		
	}

	void setLayoutManager() {

		setTitle("Sign-up Form");
		setBounds(0, 0, 370, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLayout(null);
		//setSize(420, 420);
		//setResizable(true);

		container = getContentPane();
		container.setLayout(null);
		
		backToLoginPageButton = new JButton("Back");
		backToLoginPageButton.setFocusable(false);
		
		pageTitleLabel = new JLabel("Welcome!");

		userFirstNameLabel = new JLabel("First name:");
		userFirstNameField = new JTextField();

		
		userLastNameLabel = new JLabel("Last name:");
		userLastNameField = new JTextField();
		
		sendOTPButton= new JButton("get password to your mail");
		sendOTPButton.setFocusable(false);
		
		userOTPLabel = new JLabel("OTPassword (must contain 8 characters):");
		userOTPField = new JPasswordField();
		
		showPassword = new JCheckBox("Show OTPassword");
		showPassword.setFocusable(false);
		
		submitOTPButton = new JButton("Submit");
		submitOTPButton.setFocusable(false);
		
		permanentPasswordLabel = new JLabel("Permanent password (for the first login):");
		permanentPasswordField = new JPasswordField();
		
		signinButton = new JButton("Sign-in");
		signinButton.setFocusable(false);
						
		messageLabel = new JLabel("This is a text");		
	
		setVisible(true);
		
	}
	
	void addLocationAndSize() {

		backToLoginPageButton.setBounds(200, 10, 100, 25);
		pageTitleLabel.setBounds(100, 50, 300, 30);
		
		userFirstNameLabel.setBounds(50, 100, 75, 25);
		userLastNameLabel.setBounds(50, 150, 75, 25);
		
		userFirstNameField.setBounds(125, 100, 200, 25);
		userLastNameField.setBounds(125, 150, 200, 25);
		
		sendOTPButton.setBounds(100, 200, 200, 25);
		
		userOTPLabel.setBounds(50, 250, 300, 25);
		userOTPField.setBounds(50, 300, 200, 25);
		showPassword.setBounds(50, 350, 200, 25);
		submitOTPButton.setBounds(100, 400, 100, 25);
		
		permanentPasswordLabel.setBounds(50, 450, 300, 25);
		permanentPasswordField.setBounds(50, 500, 200, 25);
		signinButton.setBounds(100, 550, 100, 25);
		
		messageLabel.setBounds(100, 600, 300, 35);		
			
	}
	
	void addComponentsToContainer() {
		
		container.add(backToLoginPageButton);
		container.add(pageTitleLabel);
		container.add(userFirstNameLabel);
		container.add(userLastNameLabel);
		container.add(userFirstNameField);
		container.add(userLastNameField);
		container.add(sendOTPButton);
		container.add(userOTPLabel);
		container.add(userOTPField);
		container.add(showPassword);
		container.add(submitOTPButton);
		container.add(permanentPasswordLabel);
		container.add(permanentPasswordField);
		container.add(signinButton);
		container.add(messageLabel);

		
	}
	
	void addActionEvent() {
		
		backToLoginPageButton.addActionListener(this);
		sendOTPButton.addActionListener(this);
		submitOTPButton.addActionListener(this);
		signinButton.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		/*if(e.getSource() == backToLoginPageButton) {
			dispose();
			new SheCodesLoginPage();
		}
		*/
		if(e.getSource() == sendOTPButton) {
			
			messageLabel.setText("the password sent");
		
		}
		if(e.getSource() == submitOTPButton) {
			
			messageLabel.setText("your ID will be <first-name>.<last-name>.she-codes");
			
		}
		if(e.getSource() == signinButton) {
	
			messageLabel.setForeground(Color.red);
			messageLabel.setText("username not found");	
			
		}
		

	}

	
}