package velan;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class velan {
	
	WebDriver driver;
	  @Test
	  public void f() throws InterruptedException, IOException {
		  
		  String fileLocation = "E:\\eclips work files\\velan\\test-data\\student-data.xlsx";
		  XSSFWorkbook wbook = new XSSFWorkbook(fileLocation);
		  XSSFSheet sheet=wbook.getSheetAt(0);
		  
		  XSSFRow row=sheet.getRow(1);
		  
		  
		  XSSFCell cell=row.getCell(0);
		  String applyingfor=cell.getStringCellValue();
		  System.out.println(applyingfor);
		  
		  XSSFCell cell1=row.getCell(1);
		  String firstname=cell1.getStringCellValue();
		  
		  
		  XSSFCell cell2=row.getCell(2);
		  String lastname=cell2.getStringCellValue();
		 
		  
		  driver.findElement(By.cssSelector("#mat-input-0")).sendKeys("jainulfayazdeen@m8itsolutions.com");
		  driver.findElement(By.cssSelector("#password")).sendKeys("123456");
		  driver.findElement(By.xpath("(//span)[12]")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("(//span)[8]")).click();
		  Thread.sleep(2000L);
		  driver.findElement(By.xpath("(//span)[9]")).click();
		  Thread.sleep(2000L);
		  driver.findElement(By.xpath("(//button)[4]")).click();
		  Thread.sleep(2000L);
		  driver.findElement(By.xpath("(//div)[81]")).click();
		  Thread.sleep(3000L);
		  //driver.findElement(By.xpath("(//span)[344]")).click();
		  driver.findElement(By.xpath(applyingfor)).click();
		  
		  
		  driver.findElement(By.xpath("(//input)[1]")).sendKeys(firstname);
		  Thread.sleep(3000L);
		  
		  driver.findElement(By.xpath("(//input)[2]")).sendKeys(lastname);
		  Thread.sleep(3000L);
		  Thread.sleep(2000l);
		  
		  
		  
		  
		  
		  
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver","E:\\eclips\\chrome driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://admin1.grootems.com/login?token=TUNOUzAwMDIzNDIz");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }

	}
