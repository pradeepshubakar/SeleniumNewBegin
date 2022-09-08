package DemoTests;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generics.FileLib;

public class Sample {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException, InvalidFormatException {
		FileLib file = new FileLib();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(file.getExcelData("./data/TestData.xlsx", "Basic", 0, 1));

		driver.findElement(By.id("username")).sendKeys(file.getExcelData("./data/TestData.xlsx", "Basic", 1, 1));
		driver.findElement(By.name("pwd")).sendKeys(file.getExcelData("./data/TestData.xlsx", "Basic", 2, 1));
		driver.findElement(By.id("loginButton")).click();
		driver.close();
	}
}
