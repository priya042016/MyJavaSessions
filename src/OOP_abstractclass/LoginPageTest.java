package OOP_abstractclass;

public class LoginPageTest {

	public static void main(String[] args) {
		LoginPage lp=new LoginPage(100);
		lp.title();
		lp.url();
		lp.doLogin("Priya", "test@123");
		lp.calculatePrice();//calling final method
		Page.logo();
		lp.forgotPwd();//individual pwd
		lp.loading();
		lp.javascriptLoading();
	}

}
