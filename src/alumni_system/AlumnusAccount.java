package alumni_system;

import java.util.ArrayList;

public class AlumnusAccount {
	
	String firstName, lastName;
	ArrayList<String> finishedCoursesList = new ArrayList<>();
	String linkedinProfileLink; 
	String jobSearchStatus; 
	String[] matchJobs; 
	ArrayList<String> mentorOfCourses = new ArrayList<>(); 
	ArrayList<String> sheCodesCoursesList;	
	UserInput input;


	public AlumnusAccount( String firstName, String lastName, UserInput input, ArrayList<String> SheCodesCoursesList) {
		
		this.firstName = firstName;
		this.lastName = lastName; 
		this.input = input;
		this.sheCodesCoursesList = SheCodesCoursesList;
		addFinishedCourseToList();
		addLinkedinLink();
		addMentorOfCourses();
		
	}
	
	
	void addFinishedCourseToList() {
		
		String finishedCourse = input.insertString( "the name of course you finished" );
		
		if ( ! sheCodesCoursesList.contains( finishedCourse ) )  {
			
			System.out.println( "there is no such course at she codes ");

		} else {
			
			finishedCoursesList.add( finishedCourse );

		}
		
	}

	
	void addLinkedinLink() {
		
		String linkedinLink = input.insertString( "the link to your linkedin profile (if don't have insert 'None') " );
		
		if ( ! linkedinLink.equalsIgnoreCase( "None" ) ) {
			
			linkedinProfileLink = validLinkedin(linkedinLink);

		}
	
	}
	
	
	String validLinkedin( String userLinkedin ) {
		
		while ( ! userLinkedin.startsWith( "www.linkedin.com/in/" ) ) {
			
			System.out.println( "this is an invalid link, please try again.");
			userLinkedin = input.insertString( "the link to your linkedin profile" );

		}
		
		return userLinkedin;
				
	}
	
	
	ArrayList<String> requestToBeMentorOfCourses(){
		
		ArrayList<String> cousesWantToMentor = new ArrayList<>();

		String mentor = input.insertString( "'yes' if you want be a mentor, else enter 'no' ");

		if ( mentor.equalsIgnoreCase("yes") ) {
			
			String mentorCourses = input.insertString( "which courses you want to mentor");
			
			cousesWantToMentor.add( mentorCourses );
		
		}
		
		System.out.println(cousesWantToMentor);
		
		return cousesWantToMentor;

	}
	
	
	void addMentorOfCourses() {
		
		mentorOfCourses = requestToBeMentorOfCourses();
	
	}
	
	
	@Override
	public String toString() {

		return "Alumnus [firstName=" + firstName + ", lastName=" + lastName + ", finishedCoursesList: " 
				+ finishedCoursesList + ", linkedinProfileLink: " + linkedinProfileLink + ", Mentor of courses: " + mentorOfCourses + " ]" ;

	}

	
}
