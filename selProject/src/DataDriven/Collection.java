package DataDriven;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collection {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("admin");
		list.add("manager");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys(list.get(0));
		driver.findElement(By.name("pwd")).sendKeys(list.get(1));
		driver.findElement(By.id("loginButton")).click();
		driver.close();
		
}
}
