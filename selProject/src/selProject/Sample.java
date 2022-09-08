package selProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	static WebDriver driver;
	
	

	static void test(String input) {
		if(input.equalsIgnoreCase("chrome")){
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		if(input.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}
		driver.get("https://www.google.com/");
		System.out.println("web name is: "+driver.getTitle());
		driver.close();
	}
}
