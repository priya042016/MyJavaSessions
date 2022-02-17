package webdriver_architecture;

public class RemoteWebDriver implements WebDriver{

	@Override
	public void findElement() {
	System.out.println("FE");
		
	}

	@Override
	public void findElements() {
		System.out.println("FEs");
		
	}

	@Override
	public void get(String url) {
		System.out.println("enter URL");
		
	}

	@Override
	public String getTitle() {
		return "Retail POR";
	}

	@Override
	public  String getUrl() {
		return "https://www.abc.com";
			}

	@Override
	public void click() {
		System.out.println("click");
		
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("enter value"+value);
		
	}

	@Override
	public void close() {
	System.out.println("close ");
		
	}

}