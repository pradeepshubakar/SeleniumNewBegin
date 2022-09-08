package selProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Two {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bspradee@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pradipradeep");
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/div/svg/g/image")).click();
		//driver.quit();
		
}
}