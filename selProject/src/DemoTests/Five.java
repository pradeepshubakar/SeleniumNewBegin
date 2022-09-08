package DemoTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Five {


	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Prade/Desktop/mtr.html");
		Select s = new Select(driver.findElement(By.id("mtr")));
		
	List<WebElement> allOptions = s.getOptions();
	System.out.println("Total count of options is: "+allOptions.size());
	
	for(WebElement a:allOptions) {
		System.out.println(a.getText());
	}
		
	System.out.println("<-----Reverse Order------>");
	
	for(int i=allOptions.size()-1 ;i >= 0;i--) {
		String txt = allOptions.get(i).getText();
		System.out.println(txt);
	}
	
	System.out.println("<----Ascending Order----->");
	
	ArrayList<String> list = new ArrayList<String>();
	for(int i=0;i<allOptions.size();i++) {
		list.add(allOptions.get(i).getText());
	}
	Collections.sort(list);
	
	for(int i=0;i<list.size();i++) {
		
		System.out.println(list.get(i));
	}
	
	System.out.println("<---Only duplicate values--->");
	
	TreeSet<String> set = new TreeSet<>();
	for(int i=0;i<allOptions.size();i++) {
		
		String text = allOptions.get(i).getText();
		if(set.add(text)==false) {
			System.out.println(text);
		}
		
	}
	
System.out.println("<---Without duplicate values--->");
	
	TreeSet<String> set1 = new TreeSet<>();
	for(int i=0;i<allOptions.size();i++) {
		
		String text1 = allOptions.get(i).getText();
		if(set1.add(text1)==true) {
			System.out.println(text1);
		}
	}
	driver.close();
}
}
