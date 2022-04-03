package testNG;

import org.testng.annotations.Test;

public class TestNGGroups {
  @Test(groups = {"smoke"})
  public void groupsTestOne() {
	  System.out.println("I am smoke Testing");
  }
  @Test(groups = {"Regression"})
  public void groupsTestTwo() {
	  System.out.println("I am Regression Testing");
  }
  @Test(groups = {"Regression"})
  public void groupsTestThree() {
	  System.out.println("I am Regression Testing");
  }
  @Test(groups = {"smoke"})
  public void groupsTestFour() {
	  System.out.println("I am smoke Testing");
  }
  @Test(groups = {"Regression"})
  public void groupsTestFive() {
	  System.out.println("I am Regression Testing");
  }
  @Test(groups = {"Regression"})
  public void groupsTestSix() {
	  System.out.println("I am Regression Testing");
  }
}
