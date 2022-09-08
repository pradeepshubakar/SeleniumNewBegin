package selProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {

	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.className("gb_d")).click();
		//driver.findElement(By.linkText("Gmail")).click();
		
		driver.findElement(By.cssSelector("a[class='gb_d']")).click();
		 List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		 for(int i=0;i<allLinks.size();i++) {
			WebElement a = allLinks.get(i);
			System.out.println(a.getText());
		 }
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}
}
