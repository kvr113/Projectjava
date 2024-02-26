package NextGeneration;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class Screenshot {
	
	
  public WebDriver driver;

@Test
  public void f() throws Exception {
	
	 String JSP = "jagan";
	  
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  org.openqa.selenium.io.FileHandler.copy(scrFile, new File("C:\\Users\\viswa\\OneDrive\\Desktop\\ALARM\\"+JSP+".png"));	  
	  
	  
  }  


@BeforeTest
  public void url() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  
	  String JSP = "surya";
	  
	  
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(scrFile, new File("C:\\Users\\viswa\\OneDrive\\Desktop\\ALARM\\"+JSP+".png"));	  
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
