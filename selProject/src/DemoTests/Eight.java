package DemoTests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eight {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://codenboxautomationlab.com/practice/");
		
		driver.findElement(By.id("openwindow")).click();
		
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow.size());
		
		for(String a:allWindow) {
			driver.switchTo().window(a);
			System.out.println(driver.getTitle());
		}
		
		driver.quit();
}
}
