package list;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTrip {

	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwif1PTFl9f5AhUclUsFHYnGDjEYABAAGgJzZg&ohost=www.google.com&cid=CAASEuRo82MlBtU0Nx6kGrdVhkMtXg&sig=AOD64_2k5jpUerqikEZ329XKbdDPW8HbzQ&q&adurl&ved=2ahUKEwip0e3Fl9f5AhXq2TgGHbgOCwoQ0Qx6BAgDEAE");
		driver.findElement(By.xpath("(//input[@placeholder = 'Any worldwide city or airport'])[1]")).sendKeys("Bang");
		Thread.sleep(3000);
		
		
	
		List<WebElement> allMatch = driver.findElements(By.xpath("//div[@class='bg-white br-4 elevation-5 p-1 p-absolute mt-1 z-50 l-0']/ul/li/p[contains(text(),'Bang')]"));
	
		System.out.println("Total matched elements are: "+allMatch.size());
		
		for(WebElement a: allMatch) {
			
			System.out.println(a.getText());
		}
		
		driver.close();
	}
}
