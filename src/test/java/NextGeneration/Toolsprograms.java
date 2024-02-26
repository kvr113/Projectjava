package NextGeneration;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Toolsprograms {
	
	public WebDriver driver;
	
  @Test
  public void studentform()throws Exception {
	  
	  
	  driver.findElement(By.id("firstName")).sendKeys("Rajesh");
	  
	  driver.findElement(By.id("lastName")).sendKeys("raju");
	  
	  driver.findElement(By.id("userEmail")).sendKeys("rajesh@gmail.com");
	  
	  driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
	  
	  driver.findElement(By.id("userNumber")).sendKeys("9988776655");
	  
	  driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();
	  Thread.sleep(3000);
	  
	  //new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"))).selectByVisibleText("1999");
	  
	 // new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"))).selectByVisibleText("June");
	  
	 // driver.findElement(By.xpath("//div[@aria-label='Choose Sunday, June 20th, 1999']")).click();
	  
	  driver.findElement(By.id("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("Maths");
	  
	  driver.findElement(By.id("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("Keys.ENTER");
	  
	  driver.findElement(By.xpath("//label[normalize-space()='Sports']")).click();
	  
	  driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\viswa\\OneDrive\\Desktop\\Gandhi.jpg");
	  
	  driver.findElement(By.id("currentAddress")).sendKeys("Hyderabad");
	  
	  driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]")).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]")).sendKeys("NCR");
	  
	  driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]")).sendKeys(Keys.ENTER);
	  
	  //City
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[10]/div[3]/div/div/div[1]/div[1]")).click();
	  
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[10]/div[3]/div/div/div[1]/div[1]")).sendKeys("Delhi");
	  
	  driver.findElement(By.id("submit"));
	  
	  
	//div[@aria-label='Choose Tuesday, February 13th, 2024']
	//input[@id='dateOfBirthInput']
	//div[@aria-label='Choose Sunday, June 20th, 1999']
  }
  
  

@BeforeTest
  public void beforeTest() throws Exception {
	
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
