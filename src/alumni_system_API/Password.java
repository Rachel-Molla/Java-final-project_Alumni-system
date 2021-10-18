package alumni_system_API;

import java.util.Random;

class Password {

	String password;
	boolean usedPassword;
	String alphaNumericCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	int numOfAlphaNumericCharactersPassword = 8;
	
	int numOfAlphaNumericCharacters = alphaNumericCharacters.length();
	Random rnd = new Random();
	int numberOfOTPSequenses = 100;
	String[] oneTimePasswordsArray = new String[numberOfOTPSequenses];
	int currentOTPIndex = 0;

	public Password () {

		generateOTPs();
		
	}
	public Password ( String password ) {

		this.password = password ;
		this.usedPassword = false;

	}


	String getPassword() {

		this.usedPassword = true ;
		return password ;

	}


	void generateOTPs() {
		
		for(int i = 0; i< numberOfOTPSequenses; i++) {
			
			oneTimePasswordsArray[i] = addPasswordToOTPArray();
			
		}
		
	}
		
	String addPasswordToOTPArray() {
		
		int randomCharIndex;
		String password = "";
		
		for(int i = 0; i< numOfAlphaNumericCharactersPassword; i++) {
		
			randomCharIndex = rnd.nextInt(numOfAlphaNumericCharacters);
			password += alphaNumericCharacters.charAt(randomCharIndex);
		}
		
		return password;
		
	}
	
	String getOneOTP() {
		
		String currentOTP = oneTimePasswordsArray[currentOTPIndex];
	
		this.password = currentOTP;
		
		currentOTPIndex++ ;
	
		return password;		
	
	}

	public String toString() {

		return password;

	}
	

}
