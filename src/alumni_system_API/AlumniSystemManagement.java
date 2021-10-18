package alumni_system_API;

import java.util.ArrayList;
import java.util.HashMap;

public class AlumniSystemManagement {

	
	Input managerInput = new Input();
	IdentificationInfo personalInfo;
	ArrayList<AlumnusAccount> alumniAccounts = new ArrayList<>();	
	ArrayList<String> sheCodesCoursesList = new ArrayList<>();

	
	public AlumniSystemManagement() {
		
		addCoursesToList();
		addUsersToLoginSystem();
		
	}

	void addCoursesToList() {

		sheCodesCoursesList.add("Basic Python");
		sheCodesCoursesList.add("Java");
		sheCodesCoursesList.add("Basic Web");
		sheCodesCoursesList.add("Data structures and Algorithms");
		sheCodesCoursesList.add("Python for programmers");
		sheCodesCoursesList.add("Landing a job");
		sheCodesCoursesList.add("Data Analysis with Python");
		sheCodesCoursesList.add("Introduction to Data Science");
		sheCodesCoursesList.add("GIT");
		sheCodesCoursesList.add("React");
		sheCodesCoursesList.add("Final Project");
		sheCodesCoursesList.add("JavaScript");
		sheCodesCoursesList.add("Cloud Application Development");
		System.out.println("She-codes courses List: " + sheCodesCoursesList);
		
		if ( isAddingCourse() ) {
			do {
				String sheCodesCourse = managerInput.insertString("the course name");
				sheCodesCoursesList.add( sheCodesCourse );
			} while ( isAddingCourse() );
		}
		
	}
	
	
	boolean isAddingCourse() {	
		String addingCourse = managerInput.insertString("'yes' if you want adding course to she codes courses list.\n if not, insert 'no'");
		return addingCourse.equalsIgnoreCase("yes");
	}

	void addUsersToLoginSystem() {
		
			do {
				personalInfo = new IdentificationInfo(managerInput);
				addNewAlumnusAccount();
			} while (isAddingUser());
	
	}

	boolean isAddingUser() {		
		String addingUser = managerInput.insertString("'yes' if you want adding user to she codes login system.\n if not, insert 'no'");
		return addingUser.equalsIgnoreCase("yes");
	
	}

	void addNewAlumnusAccount() {
	
		AlumnusAccount newAlumnusAccount = new AlumnusAccount(personalInfo.firstName, personalInfo.lastName, personalInfo.password); 
		alumniAccounts.add( newAlumnusAccount );
		System.out.println( newAlumnusAccount );
		System.out.println( alumniAccounts );

	}
	
	public boolean checkUserIDandPassword(String userID, String password){

		HashMap<String, String> loginInfo = getLoginInfo();
		return loginInfo.containsKey(userID) && loginInfo.get(userID).equals(password);
		
	}
	
	protected HashMap<String, String> getLoginInfo() {
		
		return personalInfo.loginInfo;
	
	}

	ArrayList<AlumnusAccount> getAlumniAccounts() {
		
		return alumniAccounts;
		
	}
	
	public String[] getSheCodesCoursesList(){
		
		return sheCodesCoursesList.toArray(new String[0]);
		
	}
	
	
	public AlumnusAccount alumnusAccessHisAccount(Object password) {
				
		AlumnusAccount currentAccount = null;
		
		if( alumniAccounts.get(0).password.equals(password)) {
			
			currentAccount =  alumniAccounts.get(0);

		}
		
		System.out.println( currentAccount );
		return currentAccount;

	}
	
	
}
