package alumni_system_GUI;

import alumni_system_API.AlumniSystemManagement;

public class Main {
	
	public static void main( String[] args ) {
		
		final AlumniSystemManagement systemManager = new AlumniSystemManagement();

		SheCodesLoginPage loginPage = new SheCodesLoginPage(systemManager);
	
	}

}
