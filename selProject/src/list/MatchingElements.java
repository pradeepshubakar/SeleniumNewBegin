package list;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MatchingElements {

	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Java");
		Thread.sleep(3000);
		List<WebElement> allmatch = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		
		System.out.println("total matching count is: "+allmatch.size());
		
		for(int i=0;i<allmatch.size();i++) {
			WebElement link = allmatch.get(i);
			System.out.println(link.getText());
		}
		allmatch.get(0).click();
		Thread.sleep(5000);
		driver.close();
	}
}
