package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propert {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream file = new FileInputStream("./data/commonData.properties.txt");
		Properties p = new Properties();
		p.load(file);
		driver.get(p.getProperty("url"));
		
		driver.findElement(By.id("username")).sendKeys(p.getProperty("un"));
		driver.findElement(By.name("pwd")).sendKeys(p.getProperty("pw"));
		driver.findElement(By.id("loginButton")).click();
		driver.close();
}
}