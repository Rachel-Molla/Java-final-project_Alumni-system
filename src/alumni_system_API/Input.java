package alumni_system_API;

import java.util.Scanner;

public class Input {

	
	Scanner input = new Scanner(System.in);

	
	String insertString( String strUse ){

		String strInput;

		System.out.print( "Please insert " + strUse + ": " ) ;

		do {

			strInput = input.nextLine();

		} while ( strInput.isEmpty() ); // check insert string 

		return strInput;

	}	
	
	
}
