package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the url..");
		String url = sc.next();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		TakesScreenshot t = (TakesScreenshot)driver;
		
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenShots/"+title+".png");
		FileUtils.copyFile(src, dest);
		driver.close();
		
	}
}
