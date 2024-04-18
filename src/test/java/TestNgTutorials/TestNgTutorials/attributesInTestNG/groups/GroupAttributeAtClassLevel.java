package TestNgTutorials.TestNgTutorials.attributesInTestNG.groups;

import org.testng.annotations.Test;


@Test(groups = {"all"})
public class GroupAttributeAtClassLevel 
{
	@Test(groups = { "regression" })
	private void methodTest1() {
		System.out.println("Test Method 1");
	}

	@Test(groups = { "functional" })
	private void methodTest2() {
		System.out.println("Test Method 2");
	}

	@Test(groups = { "sanity" })
	private void methodTest3() {
		System.out.println("Test Method 3");

	}

	@Test(groups = { "functional" })
	private void methodTest4() {
		System.out.println("Test Method 4");

	}

	@Test(groups = { "sanity" })
	private void methodTest5() {

		System.out.println("Test Method 5");
	}

	@Test(groups = { "sanity" })
	private void methodTest6() {

		System.out.println("Test Method 6");
	}

	@Test(groups = { "sanity" })
	private void methodTest7() {
		System.out.println("Test Method 7");

	}

	@Test(groups = { "sanity" })
	private void methodTest8() {
		System.out.println("Test Method 8");

	}

	@Test(groups = { "sanity" })
	private void methodTest9() {

		System.out.println("Test Method 9");
	}

	@Test(groups = { "functional" })
	private void methodTest10() {
		System.out.println("Test Method 10");

	}
}
