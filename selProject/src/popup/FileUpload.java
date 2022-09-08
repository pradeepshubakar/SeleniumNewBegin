package popup;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Prade/Desktop/fileUpload.html");
		
		File  f = new File("./data/actiTime.txt");
		String path = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(path);
	}
}
