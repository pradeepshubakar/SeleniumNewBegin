package DemoTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disable {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/Prade/Desktop/dasable.html");
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		driver.findElement(By.id("t1")).sendKeys("admin");
		j.executeScript("document.getElementById('t2').value='manager'");
		Thread.sleep(5000);
		j.executeScript("document.getElementById('t3').click()");
		
		driver.close();
	}
}
