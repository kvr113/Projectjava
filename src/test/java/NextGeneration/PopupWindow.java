package NextGeneration;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PopupWindow {
	
	
  public WebDriver driver;

@Test
  public void windowpopup() throws Exception {
	
	//click on separate window
	driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
	Thread.sleep(3000);
	
	//click button
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Thread.sleep(3000);
	
	//come back to parent window handle
	String backtoParentwindow = driver.getWindowHandle();
	
	//handling child window handle
	for(String childwindow : driver.getWindowHandles()) {

	//switch to child window
	driver.switchTo().window(childwindow);	
	
    }
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	//click on blog_button
	driver.findElement(By.xpath("//span[normalize-space()='Blog']")).click();
	
	//child window closed
	driver.close();
	Thread.sleep(3000);
	
	//Again switch focus back to parent window
	driver.switchTo().window(backtoParentwindow);
	Thread.sleep(10000);
	
	//click on Home_button
	driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
	Thread.sleep(3000);
}
  
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Windows.html");
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
