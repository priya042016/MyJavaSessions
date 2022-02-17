package OOP_Encapsulation;

public class LoginPageTest {

	public static void main(String[] args) {
		
		//for user 1
		LoginPage u1=new LoginPage("Priya", "test123");
		u1.doLogin();
		
		//for user 2
		LoginPage u2=new LoginPage("Krithik", "abc@123");
		
	//updating password using set password	
	u2.setPassword("selenium@123");
		
	//calling public method which uses the private members
		u2.doLogin(u2.getUsername(), u2.getPassword()); //taking the username and password during runtime
	}

}
