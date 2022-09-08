package DemoTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Eleven {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		WebElement ele = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[2]")).click();
		driver.findElement(By.id("layered_id_attribute_group_2")).click();
		Select s = new Select(driver.findElement(By.id("selectProductSort")));
		s.selectByVisibleText("Price: Highest first");
		
		//WebElement ele1 = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		//ele1.click();
		
		//driver.quit();
		
	}
}
