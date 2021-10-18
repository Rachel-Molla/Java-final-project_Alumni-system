package alumni_system_GUI;

import alumni_system_API.AlumnusAccount;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AccountPage extends JFrame implements ActionListener {

	AlumnusAccount alumnusAccount;
	String[] sheCodesCoursesList;
	
	// Components of the Form
	private Container container;
	
	private JButton signoutButton;
	private JLabel pageTitleLabel;
	private JLabel finishCoursesListLabel;
	private JLabel addFinishCourseLabel;
	private JComboBox addFinishCourseBox;
	private JLabel linkedinProfileLabel;
	private JTextField linkedinProfileField;
	private JLabel jobSearchStatusLabel;
	private JRadioButton notLookingJobRadioButton;
	private JRadioButton notLookingJobButOpenRadioButton;
	private JRadioButton lookingJobRadioButton;
	private ButtonGroup jobSearchStatusBG;
	private JLabel matchJobsLabel;
	private JLabel mentorCoursesLabel;
	private JLabel requestBeMentorCourseLabel;
	private JComboBox listMentorCourseBox;


	// constructor, to initialize the components
	// with default values.
	public AccountPage(	AlumnusAccount alumnusAccountCopy, 
	String[] sheCodesCoursesListCopy) {
		
		alumnusAccount = alumnusAccountCopy;
		sheCodesCoursesList = sheCodesCoursesListCopy;
		
		setLayoutManager();
		addLocationAndSize();
		addComponentsToContainer();
		
	}

	void setLayoutManager() {
		
		setTitle("Account Page");
		setBounds(0, 0, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		container = getContentPane();
		container.setLayout(null);

		signoutButton = new JButton("Sign-out");
		signoutButton.setFocusable(false);
		
		pageTitleLabel = new JLabel("Hello, " + alumnusAccount.getFirstName() + " " + alumnusAccount.getLastName());
		
		finishCoursesListLabel = new JLabel("Courses that you finish: " + alumnusAccount.getFinishedCoursesList());
		addFinishCourseLabel = new JLabel("Add course to your finished courses list: ");
		addFinishCourseBox = new JComboBox(sheCodesCoursesList);		
	
		linkedinProfileLabel = new JLabel("Your Linkedin profile link: " + alumnusAccount.getLinkedinProfileLink());		
		linkedinProfileField = new JTextField();
		
		jobSearchStatusLabel = new JLabel("Job search status (choose one option): " + alumnusAccount.getJobSearchStatus());		
		
		notLookingJobRadioButton = new JRadioButton("Not looking for a change");
		notLookingJobRadioButton.setSelected(true);
		notLookingJobRadioButton.setFocusable(false);
		
		notLookingJobButOpenRadioButton = new JRadioButton("Not looking but open for suggestions");
		notLookingJobButOpenRadioButton.setSelected(false);
		notLookingJobButOpenRadioButton.setFocusable(false);

		lookingJobRadioButton = new JRadioButton("Looking for new challenge");
		lookingJobRadioButton.setSelected(false);
		lookingJobRadioButton.setFocusable(false);
		
		jobSearchStatusBG = new ButtonGroup();
		jobSearchStatusBG.add(notLookingJobRadioButton);
		jobSearchStatusBG.add(notLookingJobButOpenRadioButton);
		jobSearchStatusBG.add(lookingJobRadioButton);
		
		matchJobsLabel = new JLabel("Match jobs: ");
		mentorCoursesLabel = new JLabel("Mentor courses: ");		
		requestBeMentorCourseLabel = new JLabel("Request to be mentor of course(choose one option):");
		listMentorCourseBox = new JComboBox(sheCodesCoursesList);
			
		setVisible(true);

	}
	
	void addLocationAndSize() {

		signoutButton.setBounds(500, 10, 100, 25);
		pageTitleLabel.setBounds(300, 30, 300, 30);
		finishCoursesListLabel.setBounds(100, 100, 300, 20);
		addFinishCourseLabel.setBounds(100, 150, 300, 20);
		addFinishCourseBox.setBounds(400, 150, 300, 20);
		linkedinProfileLabel.setBounds(100, 200, 300, 20);
		linkedinProfileField.setBounds(300, 200, 400, 20);
		jobSearchStatusLabel.setBounds(100, 250, 250, 20);		
		notLookingJobRadioButton.setBounds(100, 300, 250, 20);
		notLookingJobButOpenRadioButton.setBounds(350, 300, 250, 25);
		lookingJobRadioButton.setBounds(600, 300, 250, 25);
		matchJobsLabel.setBounds(100, 350, 300, 20);
		mentorCoursesLabel.setBounds(100, 400, 300, 20);
		requestBeMentorCourseLabel.setBounds(100, 450, 350, 20);
		listMentorCourseBox.setBounds(450, 450, 300, 20);

	}
	
	void addComponentsToContainer() {
			
		container.add(signoutButton);
		container.add(pageTitleLabel);
		container.add(finishCoursesListLabel);
		container.add(addFinishCourseLabel);
		container.add(addFinishCourseBox);
		container.add(linkedinProfileLabel);
		container.add(linkedinProfileField);
		container.add(jobSearchStatusLabel);
		container.add(notLookingJobRadioButton);
		container.add(notLookingJobButOpenRadioButton);
		container.add(lookingJobRadioButton);
		container.add(matchJobsLabel);
		container.add(mentorCoursesLabel);
		container.add(requestBeMentorCourseLabel);
		container.add(listMentorCourseBox);

	}
	
	void addActionEvent() {
		signoutButton.addActionListener(this);
		
	}
	
	// method actionPerformed()
	// to get the action performed
	// by the user and act accordingly
	public void actionPerformed(ActionEvent e)
	{
		/*
		if(e.getSource() == signoutButton) {
			dispose();
			new SheCodesLoginPage();
		}
		*/
	}
	
	
}
