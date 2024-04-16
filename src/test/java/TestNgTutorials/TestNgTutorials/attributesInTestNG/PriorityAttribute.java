package TestNgTutorials.TestNgTutorials.attributesInTestNG;

import org.testng.annotations.Test;

public class PriorityAttribute {

	/*
	 * In TestNG, you can set priorities for your test methods to control the order
	 * in which they are executed. This is particularly useful when you have
	 * dependencies between tests or specific sequencing requirements. Here's how
	 * you can set priorities for your test methods in TestNG: Using the priority
	 * attribute: You can specify the priority of a test method using the priority
	 * attribute in the @Test annotation. TestNG will execute methods with lower
	 * priority values first.
	 * 
	 * @Test(priority = 1) 
	 * public void testMethod1()
	 *  { // Test logic }
	 * 
	 * @Test(priority = 2) 
	 * public void testMethod2() 
	 * { // Test logic }
	 * 
	 */

	@Test(priority = -1)
	private void testMethod1() {
		System.out.println();
	}

	@Test(priority = 6)
	private void testMethod2() {

		System.out.println();
	}

	@Test(priority = 1)
	private void testMethod3() {

		System.out.println();
	}

	@Test(priority = 2)
	private void testMethod4() {
		System.out.println();

	}

	@Test(priority = 3)
	private void testMethod5() {
		System.out.println();

	}

	@Test(priority = 4)
	private void testMethod6() {
		System.out.println();
	}

	@Test(priority = 5)
	private void testMethod7() {

		System.out.println();
	}

	@Test(priority = 0)
	private void testMethod8() {

		System.out.println();
	}
}
