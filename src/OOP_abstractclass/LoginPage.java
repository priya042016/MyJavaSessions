package OOP_abstractclass;

public class LoginPage extends Page{

	LoginPage(){
		System.out.println("LoginPage-----------------Constructor");
	}
	
	LoginPage(int i){
		System.out.println("LoginPage with param-----------------Constructor");
	}

	@Override
	public void title() {
		System.out.println("LP-----------title");
		
	}

	@Override
	public void url() {
	System.out.println("LP--------------url");
		
	}
	
	@Override
	public void doLogin(String un, String pw) {
		System.out.println("LP class---------------Login"+un+":"+pw);
	}
	
	public void forgotPwd() {
		System.out.println("LP--------forgotpwd");
	}
	
	@Override
	public void loading() {
		System.out.println("LP--------------loading");
	}

	@Override
	public void javascriptLoading() {
		System.out.println("LP---------------jsScriptloading");
		
	}
		
}
