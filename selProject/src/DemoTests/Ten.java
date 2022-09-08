package DemoTests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ten {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the url......");
		String url = sc.next();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		String title = driver.getTitle();
		TakesScreenshot t = (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ss1/"+title+".png");
		FileUtils.copyFile(src, dest);
		driver.quit();
	}
}
