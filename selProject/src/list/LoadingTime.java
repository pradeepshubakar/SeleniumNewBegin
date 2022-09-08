package list;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadingTime {

	

	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(7, TimeUnit.SECONDS);
		
		try {
			driver.get("https://demo.actitime.com/login.do");
			System.out.println("page loaded within 7 seconds");
		}
		catch(Exception e){
			System.out.println("it is failed to load the page within 7 seconds");
			//e.printStackTrace();
		}
		
	}
}
