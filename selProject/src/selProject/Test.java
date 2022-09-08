package selProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.get("https://github.com/mozilla/geckodriver/releases");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.manage().deleteAllCookies();
		System.out.println(driver.getPageSource());
		driver.quit();
	}
}
