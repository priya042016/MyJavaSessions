package javasessions;

public class SwitchCase {

	public static void main(String[] args) {
		String browser=" Chr ome";
		switch (browser.toLowerCase().replace(" ", "")) {
		
		case ("chrome"):
			System.out.println("Launch Chrome");
			break;
		case ("ff"):
			System.out.println("Launch Firefox");
			break;
		default:
			System.out.println("Enter valid browser");
			break;
		}

	}

}
