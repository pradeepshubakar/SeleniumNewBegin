package selProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		Dimension userName = driver.findElement(By.id("email")).getSize();
		Dimension pass = driver.findElement(By.id("pass")).getSize();
		
		System.out.println("username box height is: "+userName.getHeight());
		System.out.println("username box width is: "+userName.getWidth());
		System.out.println("password box height is: "+pass.getHeight());
		System.out.println("password box width is: "+pass.getWidth());
		
		if(userName.getHeight()==pass.getHeight()) {
			
			System.out.println("both textbox heights are same...");
			
		}
		else {
			System.out.println("both textbox heights are not same...");
		}
		
		int x = driver.findElement(By.id("email")).getLocation().getX();
		int y = driver.findElement(By.id("email")).getLocation().getY();
		
		System.out.println("x coordinaor is: "+x);
		System.out.println("y coordinaor is: "+y);
		driver.close();
		
	}
}
