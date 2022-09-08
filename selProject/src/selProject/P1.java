package selProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.opensourcebilling.org");
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(10000);
		driver.close();
	}
}
