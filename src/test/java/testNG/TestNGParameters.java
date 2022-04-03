package testNG;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import core.Base;
import pageObj.HotelPageObject;

public class TestNGParameters extends Base {
	@Test
	@BeforeMethod
	public void beforeMethod() {
		initializeDriver();
		logger.info("Browser opened");	
	}
	
	
  @Test
  @Parameters({"email", "password"})
  public void Parameterstest(String email,String password) {
	  HotelPageObject hotelPage = new HotelPageObject(); 
		  hotelPage.clickOnSignIn();
		  logger.info("This is it");
		  hotelPage.enterEmail(email);
		  hotelPage.enterPassword(password);
		  hotelPage.clickOnSignINButton();
		  logger.info("user enter creditianls"); 
  }
  
  
  @Test
	@AfterMethod
	public void afterMethod() {
		tearDown();
		logger.info("Browser closed");
	}
}
