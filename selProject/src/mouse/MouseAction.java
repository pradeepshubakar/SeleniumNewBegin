package mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {


	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.vtiger.com/");
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("(//a[@id=\"navbarPages\"])[2]"))).perform();
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div/ul/li[5]/div/div/div[3]/ul/li[3]/a")).click();
		String txt = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/div/div[1]/div/p[2]")).getText();
		System.out.println(txt);
		driver.close();

		
}
}
