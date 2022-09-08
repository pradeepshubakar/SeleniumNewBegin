package DemoTests;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seven {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Prade/Desktop/fileUpload.html");
		File f = new File("./data/actiTime.txt");
		String ObsPath = f.getAbsolutePath();
		
		try {
			driver.findElement(By.id("cv")).sendKeys(ObsPath);
			System.out.println("File upload success");
		}
		catch(Exception e) {
			System.out.println("File upload Failed");
			e.printStackTrace();
		}
		
		driver.close();
		
	}
}
