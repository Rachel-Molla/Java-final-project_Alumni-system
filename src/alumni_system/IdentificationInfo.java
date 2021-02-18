package alumni_system;

public class IdentificationInfo {
	
	
	String firstName, lastName, password , ID;

	UserInput input;


	public IdentificationInfo( String OTP, UserInput input ) {

		this.input = input;
		this.password = OTP;

		setID();

	}


	void setID() {

		firstName = input.insertString( "your first name" );

		lastName = input.insertString( "your last name" );

		generateID();
		
	}


	void generateID(){
		
		String extention = "she-codes";
		String[] IdArray = {this.firstName, this.lastName, extention } ; 		
		ID = String.join( ".", IdArray);
		
	}
	
	String[] idAndPassword() {
			
		return new String[]{ ID, password };
		
	}
	
	
	public String toString() {

		return "ID: " + ID +  ", PASSWORD: " + password;

	}
	
	
}
