package TestNgTutorials.TestNgTutorials.attributesInTestNG;

import org.testng.annotations.Test;

public class GroupAttributeWithRegularExpression 
{
	/*
	 * In TestNG, you can use regular expressions (regex) to define groups for your test methods.
	 * This allows for more flexible and dynamic grouping based on method names or other criteria.*/

	@Test(groups = { "windows.smoke" })
	private void methodTest1() {
		System.out.println("Test Method 1");
	}

	@Test(groups = { "windows.sanity" })
	private void methodTest2() {
		System.out.println("Test Method 2");
	}

	@Test(groups = { "ios.sanity" })
	private void methodTest3() {
		System.out.println("Test Method 3");

	}

	@Test(groups = { "android.sanity" })
	private void methodTest4() {
		System.out.println("Test Method 4");

	}

	@Test(groups = { "windows.sanity" })
	private void methodTest5() {

		System.out.println("Test Method 5");
	}

	@Test(groups = { "android.sanity" })
	private void methodTest6() {

		System.out.println("Test Method 6");
	}

	@Test(groups = { "windows.sanity" })
	private void methodTest7() {
		System.out.println("Test Method 7");

	}

	@Test(groups = { "ios.sanity" })
	private void methodTest8() {
		System.out.println("Test Method 8");

	}

	@Test(groups = { "android.sanity" })
	private void methodTest9() {

		System.out.println("Test Method 9");
	}

	@Test(groups = { "windows.sanity" })
	private void methodTest10() {
		System.out.println("Test Method 10");

	}
}
