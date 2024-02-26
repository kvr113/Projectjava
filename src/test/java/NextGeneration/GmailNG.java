package NextGeneration;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GmailNG {
	
	public WebDriver driver;
		
  @Test(priority = 1)
  public void login() {
	  
	  
  }
  
  @Test(priority = 2)
  public void compose() {
	  
	  
  }
  
  @Test(priority = 3)
  public void sent() {
	  
	  
  }
  
  @Test(priority = 4)
  public void draft() {
	  
	  
  }
  
  @BeforeTest
  public void openurl() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://gmail.com");
	  
	  
	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
