package javasessions;

public class Browser {

	//launch a browser
	//input param: name (String): FF/CH/IE
	//return: boolean value
	
	public boolean launchBrowser(String name) {
		System.out.println("Launching browser");
		boolean flag;
		switch (name.toLowerCase()) {
		case "ff":
			System.out.println("FF is launched");
			//return true;
			flag=true;
		case "ie":
			System.out.println("ie is launched");
			//return true;
			flag=true;
		case "ch":
			System.out.println("chrome is launched");
			//return true;
			flag=true;
			break;

		default:
			System.out.println("pass valid browser");
			//return false;
			flag=false;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Browser br=new Browser();
		br.launchBrowser("CH");
		br.launchBrowser("opera");

	}

}
