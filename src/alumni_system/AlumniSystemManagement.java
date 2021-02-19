package alumni_system;

import java.util.ArrayList;
import java.util.HashMap;

public class AlumniSystemManagement {

	
	HashMap< String[], AlumnusAccount > alumniAccounts = new HashMap< String[] , AlumnusAccount >();

	
	SheCodesLogin login = new SheCodesLogin();
	
	
	OneTimePassword OTP = new OneTimePassword();


	UserInput input = new UserInput();

	
	ArrayList<String> sheCodesCoursesList = new ArrayList<>();

	
	public AlumniSystemManagement() {
		
		addCoursesToList();
		
	}
	
	
	void addNewAlumnusAccount() {

		IdentificationInfo keyInfo =  new IdentificationInfo(  OTP.getOneOTP(), input);
		
		AlumnusAccount newAlumnus = new AlumnusAccount( keyInfo.firstName, keyInfo.lastName, input, sheCodesCoursesList ); 
		
		alumniAccounts.put( keyInfo.idAndPassword() , newAlumnus );
		
		System.out.println( keyInfo );
		System.out.println( newAlumnus );

	}
	
	
	void alumnusAccessHisAccount() {
		
		AlumnusAccount currentAccount =  alumniAccounts.get( login.idAndPasswordLogin() );
		
		System.out.println( currentAccount );
		
	}
	
	
	void addCoursesToList() {
		
		sheCodesCoursesList.add( "Basic Python" );
		sheCodesCoursesList.add( "Java" );
		sheCodesCoursesList.add( "Basic Web" );
		sheCodesCoursesList.add( "Data structures and Algorithms" );
		sheCodesCoursesList.add( "Python for programmers" );
		sheCodesCoursesList.add( "Landing a job" );
		sheCodesCoursesList.add( "Data Analysis with Python" );
		sheCodesCoursesList.add( "GIT" );
		sheCodesCoursesList.add( "React" );
		sheCodesCoursesList.add( "Final Project" );
		System.out.println( sheCodesCoursesList );
		
	}
	
	
}
