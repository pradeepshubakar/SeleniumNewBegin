package selProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P9 {


	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.opensourcebilling.org/en/users/sign_in");
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ac");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"av");
		Thread.sleep(5000);
		driver.close();
	}
}
