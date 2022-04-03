package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExectution {
  @Test
  public void chrome() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://tek-school.com/retail/");  
	  driver.close();
  }
  
  @Test
  public void edge() {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver = new EdgeDriver();
	  driver.get("http://tek-school.com/hotel/");
	  driver.close();
	  
  }
  
  public void fireFox() {
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver = new FirefoxDriver(); 
	  driver.get("https://tekschool.us/");
	  driver.close();
  }
}
