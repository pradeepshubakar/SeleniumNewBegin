package selProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8 {

	
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		boolean img = driver.findElement(By.xpath("//div[@class='atLogoImg']")).isDisplayed();
		
		if(img==true) {
			System.out.println("Image is displaying...");
		}
		else {
			System.out.println("Image is not displaying...");
		}
		
		WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
		
		if(login.isEnabled()) {
			System.out.println("Login button is enabling...");
		}
		else {
			System.out.println("Login button is not enabling...");
		}
		
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		if(checkBox.isSelected()) {
			System.out.println("check box is selected by default...");
		}
		else {
			System.out.println("check box is not selected by default...");
		}
		
		WebElement txt = driver.findElement(By.id("toPasswordRecoveryPageLink"));
		System.out.println("The text is: "+txt.getText());
		System.out.println("URL link is: "+txt.getAttribute("href"));
		
		System.out.println("Tagname is : "+txt.getTagName());
		
		String color = driver.findElement(By.id("loginButton")).getCssValue("color");
		System.out.println("rgb color code is: "+color);
		if(color.contains("rgb")) {
			System.out.println("It is blue color...");
		}
		
		String color1 = driver.findElement(By.id("loginButton")).getCssValue("font-family");
		System.out.println("Font Family is: "+color1);
		String color2 = driver.findElement(By.id("loginButton")).getCssValue("font-size");
		System.out.println("size of color is: "+color2);
		driver.close();
	}
}
