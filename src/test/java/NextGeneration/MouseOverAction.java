package NextGeneration;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class MouseOverAction {
	public WebDriver driver;
	public Actions action;
	
	
  @Test
  public void MouseOver() throws Exception {
	  
	  action = new Actions(driver);
	  
	  WebElement ele1 = driver.findElement(By.linkText("SwitchTo"));
	  
	  action.moveToElement(ele1).build().perform();
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.linkText("Windows")).click();
	  Thread.sleep(3000);
	  
	  
	  
  }
  
  @BeforeTest
  public void openurl() {
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
	  driver.get("https://demo.automationtesting.in/Register.html");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
