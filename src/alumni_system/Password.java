package alumni_system;

public class Password {


	String password;
	boolean usedPassword;


	public Password ( String password ) {

		this.password = password ;
		this.usedPassword = false;

	}

	String getPassword() {

		this.usedPassword = true ;
		return password ;

	}


	public String toString() {

		return password;

	}
	

}
