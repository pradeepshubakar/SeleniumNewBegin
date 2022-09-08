package selProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Four {

	
static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		int count = 0;
		
		for(int i = 0;i<allLinks.size();i++) {
			
			WebElement we = allLinks.get(i);
			System.out.println(we.getText());
			count++;
		}
		System.out.println("total links are present on this page is: "+count);
		WebElement last = driver.findElement(By.xpath("(//a)[last()-5]"));
		System.out.println("last link name is: "+last.getText());
		driver.close();
	}
	
	
}
