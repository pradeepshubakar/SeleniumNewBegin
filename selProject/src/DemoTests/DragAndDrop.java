package DemoTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		Actions a = new Actions(driver);
		
		WebElement src = driver.findElement(By.id("drag1"));
		WebElement target = driver.findElement(By.id("div2"));
		
		try {
			a.dragAndDrop(src, target).perform();
			System.out.println("Drag and Drop Success");
		}
	
		catch(Exception e) {
			System.out.println("Drag and Drop Failed");
			e.printStackTrace();
		}
	}
}
