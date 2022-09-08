package DemoTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bbc.com/news");
		
		driver.findElement(By.xpath("//*[@id=\"responsive-news\"]/body/div[10]/div/button")).click();
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"u12801832723277262\"]/div/div/div[2]/div[2]/div/div[1]/div/div[2]/a"));
		System.out.println("x value: "+ele.getLocation().getX());
		System.out.println("y value: "+ele.getLocation().getY());
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(568,1253)");
	}
}
