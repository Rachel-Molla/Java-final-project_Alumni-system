package alumni_system;

import java.util.ArrayList;

public class AlumnusAccount {
	
	String firstName, lastName;
	ArrayList<String> finishedCoursesList = new ArrayList<>();
	String linkedinProfileLink; 
	String jobSearchStatus; 
	String[] matchJobs; 
	String[] mentorOfCourses; 
	ArrayList<String> sheCodesCoursesList;	
	UserInput input;


	public AlumnusAccount( String firstName, String lastName, UserInput input, ArrayList<String> SheCodesCoursesList) {
		
		this.firstName = firstName;
		this.lastName = lastName; 
		this.input = input;
		this.sheCodesCoursesList = SheCodesCoursesList;
		addFinishedCourseToList();
		addLinkedinLink();
		
	}
	
	
	void addFinishedCourseToList() {
		
		String finisedCourse = input.insertString( "the name of course you finished" );
		
		if ( ! sheCodesCoursesList.contains( finisedCourse ) ) {
			
			System.out.println( "there is no such course at she codes ");

		} else {
			
			finishedCoursesList.add( finisedCourse );

		}
		
	}

	
	void addLinkedinLink() {
		
		String linkedinLink = input.insertString( "the link to your linkedin profile" );
		
		if ( linkedinLink.startsWith( "www.linkedin.com/in/" ) ) {
			
			linkedinProfileLink = linkedinLink;

		} else {
			
			System.out.println( "invalid link" );

		}
		
	}
	
	
	String[] requestToBeMentorOfCourses(){

		return new String[]{};

	}
	

	@Override
	public String toString() {

		return "Alumnus [firstName=" + firstName + ", lastName=" + lastName + ", finishedCoursesList: " 
				+ finishedCoursesList + ", linkedinProfileLink: " + linkedinProfileLink + " ]" ;

	}

	
}
