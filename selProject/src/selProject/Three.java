package selProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Three {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		String t = driver.findElement(By.xpath("//p[text()='Python']/../p[2]")).getText();
		System.out.println("version of python is: " +t);
		driver.quit();
		
	}
}
