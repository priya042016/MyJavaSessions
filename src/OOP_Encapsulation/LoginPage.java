package OOP_Encapsulation;

public class LoginPage {
	
	private String username;
	private String password;
	
	LoginPage(String username, String password){
		this.username=username;
		this.password=password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//write business logic //public methods
	//taking username and password during run time.	this is encapsulation method accessing private members
	
	public void doLogin() {
		System.out.println("please enter username:"+this.username);
		System.out.println("please enter password:"+this.password);
		System.out.println("Login is done");
	}
	//this method is not part of encapsulation as we use here local method variable
	public void doLogin(String uname, String pwd) {
		System.out.println("please enter username:"+uname);
		System.out.println("please enter password:"+pwd);
		System.out.println("Login is successful");
	}
	

}
