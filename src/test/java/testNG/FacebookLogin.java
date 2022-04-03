package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLogin {

	WebDriver driver;
	@Test(dataProvider = "Testdata")

	public void setUp(String uname, String password) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		driver.close();

	}
 
	@DataProvider(name = "Testdata")
	public Object[][] TestDataFeed() {

		Object[][] facebookdata = new Object[2][2];
		facebookdata[0][0] = "ty@gmail.com";
		facebookdata[0][1] = "pass1";
		facebookdata[1][0] = "yt@gmail.com";
		facebookdata[1][1] = "pass2";

		return facebookdata;
	}

	


}
