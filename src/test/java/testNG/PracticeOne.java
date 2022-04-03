package testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PracticeOne {
	@Test (priority = 9)
	public void TimeToDie(){	
	 }
	 @Test(priority = 8)
	 public void Titanic() {
		  
	 }
	 @Test(priority = 2, enabled = false)
     public void Revange() {
			  
	 }
	 @Test 
	 @Ignore
	 public void LifeTime() {
				  
	 }
	 @Test(priority = 7)
	 public void GreatShark() {
					  
	 }
	 @Test(priority = 6)
	 public void MrBean() {
						  
     }
	 @Test(priority = 5)
	 public void TommorrowNeverDie() {
							  
	 }@Test(priority = 4)
	 public void EndOfTheWorld () {
								  
	 }
	 @Test(priority = 3)
	 public void TheMeg() {
		 
	 }
	 @Test(priority = 1)
     public void SpiderMan() {
  }
}
