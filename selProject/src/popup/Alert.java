package popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {

	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Prade/Desktop/alertOrJavaScript_popup.html");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		org.openqa.selenium.Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
	}
}
