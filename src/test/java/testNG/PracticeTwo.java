package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class PracticeTwo {
	@Test
	@BeforeMethod
	public void beforTest() {
		System.out.println("beforeMethod prints before each test");
	}

	@Test
	@AfterMethod
	public void afterTest() {
		System.out.println("afterMethod prints after each test");
	}

	@Test(groups = { "Blue" }, priority = 1)
	public void groupsOne() {

	}

	@Test(groups = { "Blue" }, priority = 2)
	public void groupsTwo() {

	}

	@Test(groups = { "Blue" }, priority = 3)
	public void groupsThree() {

	}

	@Test(groups = { "Blue" }, priority = 4)
	public void groupsFour() {

	}

	@Test(groups = { "Blue" }, priority = 5)
	public void groupsFive() {

	}

	@Test
	@Parameters({"valueOne", "valueTwo", "valueThree", "valueFour", "valueFive"})
	public void valuesTest(String vlOne, String vlTwo, String vlThree, String vlFour, String vlFive) {
		System.out.println(vlOne);
		System.out.println(vlTwo);
		System.out.println(vlThree);
		System.out.println(vlFour);
		System.out.println(vlFive);

	}

}
