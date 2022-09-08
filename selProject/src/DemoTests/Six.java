package DemoTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Six {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Prade/Desktop/alertOrJavaScript_popup.html");
		driver.switchTo().alert().accept();
}
}