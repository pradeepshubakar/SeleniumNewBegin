package list;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListWeb {


	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the url");

		String url = sc.next();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(url);
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		System.out.println("total links count is: "+allLinks.size());
		
		WebElement firstLink = allLinks.get(0);
		System.out.println(firstLink.getText());
		
		for(int i =0;i<allLinks.size();i++) {
			 WebElement link = allLinks.get(i);
			 System.out.println(link.getText());
		}
		
		driver.close();
}
}
