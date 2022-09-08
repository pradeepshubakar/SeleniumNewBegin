package IistBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mulitselect {


	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Prade/Desktop/mtr.html");
		//WebElement ele = driver.findElement(By.id("file:///C:/Users/Prade/Desktop/mtr.html"));
		WebElement ele = driver.findElement(By.id("mtr"));
		Select s = new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("d");
		s.selectByVisibleText("Pongal");
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		List<WebElement> allOptions = s.getOptions();
		System.out.println("total count of options is: "+allOptions.size());
		
		for(WebElement a:allOptions) {
			System.out.println(a.getText());
		}
		System.out.println("..........reverse order.........");
		for(int i=allOptions.size()-1;i>=0;i--) {
			WebElement op = allOptions.get(i);
			System.out.println(op.getText());
		}
		
		System.out.println("......Ascending order.....");
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0;i<allOptions.size();i++) {
			String t = allOptions.get(i).getText();
			list.add(t);
		}
		Collections.sort(list);
/*
		Iterator it = list.iterator();
		while(it.hasNext()) {
			 Object ob = it.next();
			
			System.out.println(ob);
		}*/
		
		for(String a:list) {
			System.out.println(a);
		}
		driver.close();
	}
}
