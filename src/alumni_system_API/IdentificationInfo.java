package alumni_system_API;

import java.util.HashMap;

public class IdentificationInfo {
	
	Input managerInput;
	String firstName, lastName, ID, password;
	String idExtention = "she-codes";
	Password OTP = new Password();

	
	final HashMap<String, String> loginInfo = new HashMap<String, String>();

	IdentificationInfo(	Input managerInput) {

		this.managerInput = managerInput;
		setFirstName();
		setLastName();
		setID();
		setPassword();
		loginInfo.put(ID, password);
		
	}
	
	void setFirstName() {

		firstName = managerInput.insertString( "user first name" );
		
	}

	void setLastName() {

		lastName = managerInput.insertString( "user last name" );
		
	}

	void setID(){
		
		String[] IdArray = {firstName, lastName, idExtention } ; 		
		ID = String.join( ".", IdArray);
		System.out.println("current user Id is: " + ID);
		
	}
	
	void setPassword(){
		
		password = OTP.getOneOTP();
		System.out.println("current user OTP is: " + password);
	
	}
	
	public String toString() {

		return "ID: " + ID +  ", PASSWORD: " + password;

	}
	
}
