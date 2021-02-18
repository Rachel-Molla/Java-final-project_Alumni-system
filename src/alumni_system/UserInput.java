package alumni_system;

import java.util.Scanner;

public class UserInput {

	
	Scanner input = new Scanner(System.in);

	
	String insertString( String strUse ){

		String strInput;

		System.out.print( "Please insert " + strUse + ": " ) ;

		do {

			strInput = input.nextLine();

		} while ( strInput.isEmpty() ); // check that user insert string 

		return strInput;

	}	
	
	
}
