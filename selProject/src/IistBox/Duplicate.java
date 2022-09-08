package IistBox;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicate {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Prade/Desktop/mtr.html");
		WebElement ele = driver.findElement(By.id("mtr"));
		Select s = new Select(ele);
		List<WebElement> options = s.getOptions();
		TreeSet<String> set = new TreeSet<String>();
		TreeSet<String> set1 = new TreeSet<String>();
	System.out.println("<---------Only duplicates--------->");
		for(int i=0;i<options.size();i++) {
			String op = options.get(i).getText();
			if(set.add(op)==false) {
				System.out.println(op);
			}
			
		}
		
		System.out.println("<--------without dupicates----->");
		
		for(int i=0;i<options.size();i++) {
			String op = options.get(i).getText();
			if(set1.add(op)==true) {
				System.out.println(op);
			}
			
		}
		driver.close();
}
}
