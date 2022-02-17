package OOP_Encapsulation;

public class Browser {
	
	//Encapsulation accessing private methods using public method
	
	public void launchBrowser() {
	System.out.println("Launching Broswer");	
	chkOSCompatible();
	chkBrowserVersion();
	isBrowserUpgraded();
	System.out.println("Browser launched successfully");
	}
	
	private void chkOSCompatible() {
		System.out.println("is compatible");
	}
	
	private void chkBrowserVersion() {
		System.out.println("broswer version");
	}
	
	private void isBrowserUpgraded() {
		System.out.println("is upgraded");
	}

}
