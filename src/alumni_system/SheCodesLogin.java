package alumni_system;

public class SheCodesLogin {
	
	
	UserInput loginInput = new UserInput();
	
	String id, password;
	
	
	String insertIdLogin(){

		id = loginInput.insertString("your ID");
		return id;
				
	}
	
	
	String insertPasswordLogin(){

		password = loginInput.insertString("your PASSWORD");
		return password;
		
	}
	
	
	String[] idAndPasswordLogin() {
		
		String[] idAndPassword = { insertIdLogin(), insertPasswordLogin() };
		return idAndPassword;
	
	}
	
	
	void setDetails() {
		
	}
	
	
}
