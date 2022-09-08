package DemoTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {

	
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		WebElement gMail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		String txt = gMail.getText();
		System.out.println("Text present on Gmail link is: "+txt);
		
		String link = gMail.getAttribute("href");
		System.out.println("Url link of gmail link is: "+link);
		System.out.println("Tagname of gmail link is: "+gMail.getTagName());
		driver.close();
	}
}
