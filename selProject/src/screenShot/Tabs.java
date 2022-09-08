package screenShot;

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs {


	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the url..");
		//String url = sc.next();
		//url = "https://demo.actitime.com/login.do";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allTabs = driver.getWindowHandles();
		System.out.println("total tabs numbers is: "+allTabs.size());
		
		for(String tab:allTabs) {
			String title = driver.switchTo().window(tab).getTitle();
			System.out.println(title);
			driver.close();
		}
		//driver.quit();
	}
}
