package alumni_system;

import java.util.Arrays;

public class OneTimePassword {

	//consisted of 8 alphanumeric characters
	char[] alphaNumericCharacters = {'a', 'b', 'c', 'd', '1', '2', '3', '4'};
	int numOfAlphaNumericCharacters = 8 ;
	Password[] oneTimePasswordsArray = new Password[8];
	int currentOTPIndex = 0;

	public OneTimePassword() {

		generatePasswords();

	}

	void generatePasswords() {
	
		char[] charArray = alphaNumericCharacters;
		int timesOfRotation = numOfAlphaNumericCharacters;		
		String passwordSequence;
	
		//perform times rotations right
		for ( int i = 0 ; i < timesOfRotation ; i++ ) {
	
			passwordSequence = new String( charArray );
			oneTimePasswordsArray[i] = new Password( passwordSequence );
			oneCyclicRotationArray( charArray) ;
	
		}
	
		System.out.println( Arrays.toString(oneTimePasswordsArray));
	
	}
	
	
	void oneCyclicRotationArray( char[] charArray ) {
	
		int arrLen = charArray.length; 
	
		int nextIndex;
		char nextValue;
	
		//perform one rotation right
		for ( int j = 0 ; j < arrLen-1 ; j++ ) {
	
			nextIndex = ( j + 1 ) %  arrLen ; 
			nextValue = charArray[ nextIndex ] ;
	
			charArray[ nextIndex ] = charArray[0] ;
			charArray[0] = nextValue ;
	
		}
	
	}
	
	
	String getOneOTP() {
	
		String currentOTP = oneTimePasswordsArray[currentOTPIndex].getPassword() ;
	
		currentOTPIndex++ ;
	
		return currentOTP;		
	
	}
	
	
}
