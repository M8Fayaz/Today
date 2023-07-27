package velan;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Velan2 {
	WebDriver driver;
	  @Test
	  public void f() throws InterruptedException, IOException {
		  String file = "E:\\eclips work files\\velan\\test-data\\student-data.xlsx";
		  FileInputStream inputstream = new FileInputStream(file);
		  XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		  XSSFSheet sheet = workbook.getSheetAt(0);
		  XSSFRow row = sheet.getRow(0);
		  String cell = row.getCell(0).toString();
		  System.out.println(cell);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.cssSelector("#mat-input-0")).sendKeys("jainulfayazdeen@m8itsolutions.com");
		  driver.findElement(By.cssSelector("#password")).sendKeys("123456");
		  driver.findElement(By.xpath("(//span)[12]")).click();
		  Thread.sleep(4000L);
		  driver.findElement(By.xpath("(//span)[8]")).click();
		  Thread.sleep(2000L);
		  driver.findElement(By.xpath("(//span)[9]")).click();
		  Thread.sleep(2000L);
		  driver.findElement(By.xpath("(//button)[4]")).click();
		  Thread.sleep(2000L);
		  driver.findElement(By.xpath("(//div)[81]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("(//span)[345]")).click();
		  driver.findElement(By.xpath("(//input)[1]")).sendKeys(cell);
		  Thread.sleep(5000);

		  
		  
		  
	  }
	  @BeforeClass
	  public void beforeClass() throws IOException {
		  System.setProperty("webdriver.chrome.driver","E:\\eclips\\chrome driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://admin1.grootems.com/login?token=TUNOUzAwMDIzNDIz");
		 
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }

	}



