package OOP_abstractclass;

public abstract class  Page extends WebPage implements W3C{
	
	
	Page() {
		System.out.println("Page-----default constructor");
	}
	
	public abstract void title();
	public abstract void url();
	
	public void doLogin(String un, String pw) {
		System.out.println("Page class---------------Login");
	}
	//use static for common method
	public static void logo() {
		System.out.println("Page-----logo");
	}
	
	//use final for fixed value
	
	public final void calculatePrice() {
		System.out.println("Page--------price");
	}
	@Override
	public void loading() {
		System.out.println("Page--------------loading");
	}
	

}
