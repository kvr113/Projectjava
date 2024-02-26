package NextGeneration;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alert_java {
	
	public WebDriver driver;
	
	
  @Test
  public void handlingAlerts() throws Exception {
	  
	  //click on click me button;
	  driver.findElement(By.xpath("//button[@id='alertButton']"));click();
	  Thread.sleep(2000);
	  	  
	  String str = driver.switchTo().alert().getText();
	  
	  System.out.println(str);
	  Thread.sleep(3000);
	  
	  //handling alert;
	  driver.switchTo().alert().accept();  
	  
	  
	  
  }
  
 
private void click() {
	// TODO Auto-generated method stub
	
}


@BeforeTest
  public void openurl() throws Exception {
	
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver ();
	  driver.get("https://demoqa.com/alerts");
	  Thread.sleep(3000);
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
