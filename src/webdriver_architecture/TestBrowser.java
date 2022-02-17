package webdriver_architecture;

public class TestBrowser {

	public static void main(String[] args) {
		String browser="IE";
		
		WebDriver driver=null;
		
		
		if (browser.equals("chrome")) {
			driver =new ChromeDriver();
		} 
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Pass right browser");
		}
//		catch(Exception e) {
//			System.out.println("NPE");
//		}
		driver.get("www.retailpor.com");
		String url=driver.getUrl();
		System.out.println("THe URL is:"+url);
		String title=driver.getTitle();
		System.out.println("Title is :"+ title);
		driver.findElement();
		driver.sendKeys("username@gmail.com");
		driver.sendKeys("test@123");
		driver.click();
		driver.close();

	}

}
