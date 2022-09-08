package DemoTests;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Three {

	

	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the url.....");
		String url = sc.next();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println("Total number of links is: "+allLinks.size());
		
		for(WebElement a:allLinks) {
			System.out.println(a.getText());
		}
		
		driver.close();
}
}
