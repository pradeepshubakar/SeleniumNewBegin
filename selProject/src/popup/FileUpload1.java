package popup;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload1 {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/seeker/registration?spl=IN-Acq-SEM-Google-IP_Monster_Brand_Exact-GSN-Monster_Jobs-monster%20jobs-Both-Brand---598493896547---CPC-6645446156&utm_campaign=IN_Acq_SEM-Google-IP_Monster_Brand_Exact-GSN-Monster_Jobs-monster%20jobs-&utm_medium=SEM&utm_source=Google-GSN-CPC&utm_term=SEM_monster%20jobs&gclid=EAIaIQobChMIusKru5vY-QIVvYdLBR37rQnSEAAYASAAEgKfO_D_BwE");
		

		File  f = new File("./data/actiTime.txt");
		String path = f.getAbsolutePath();
		driver.findElement(By.xpath("//span[text()='Choose CV']")).click();
	}
}
