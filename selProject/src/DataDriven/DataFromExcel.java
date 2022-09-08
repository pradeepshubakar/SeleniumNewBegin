package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataFromExcel {

static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
	/*	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
		File f = new File("./data/TestData.xlsx");
		
		FileInputStream file = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Basic");
		int totalRow = sheet.getLastRowNum();
		System.out.println(totalRow);
		String url = sheet.getRow(0).getCell(1).toString();
		String un = sheet.getRow(1).getCell(1).toString();
		String pw = sheet.getRow(2).getCell(1).toString();
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.id("loginButton")).click();
		driver.close();
		
	}
}
