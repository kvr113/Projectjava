package NextGeneration;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GoogleMeet {
	
	public WebDriver driver;
	
  @Test
  public void Google_Meet() throws Exception {
	  
	  // click on camera button
	  driver.findElement(By.xpath("//div[@aria-label='Turn on camera (ctrl + e)']")).click();
	  
	  //click on michrophone_button
	  driver.findElement(By.xpath("//div[@aria-label='Turn off microphone (ctrl + d)']")).click();
	  Thread.sleep(3000);
	  
	  //click on join button
	  driver.findElement(By.xpath("//span[normalize-space()='Join now']")).click();
	   
	  
  }
  
  @BeforeTest
  public void url() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://meet.google.com/zbv-gnkf-jwr");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	
  }

}
