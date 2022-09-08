package DemoTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two {

	

	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demo.opensourcebilling.org");
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ac");
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"av");
		Thread.sleep(10000);
		
		String clr = driver.findElement(By.id("user_login_btn")).getCssValue("color");
		System.out.println(clr);
		driver.close();
}
}