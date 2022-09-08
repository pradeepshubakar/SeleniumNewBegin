package IistBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Month {


	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Rama");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("king");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("1234561235");
		driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("Rama@123");
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByValue("3");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Apr");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1986");
		
		driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[2]/input")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	}
}
