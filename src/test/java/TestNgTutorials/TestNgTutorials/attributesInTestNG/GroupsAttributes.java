package TestNgTutorials.TestNgTutorials.attributesInTestNG;

import org.testng.annotations.Test;

public class GroupsAttributes 
{
	@Test(groups = {"sanity"})
	private void methodTest11() 
	{
		System.out.println("Test Method 11");
	}
	@Test(groups = {"functional"})
	private void methodTest12() 
	{
		System.out.println("Test Method 12");
	}
	@Test(groups = {"sanity"})
	private void methodTest13() 
	{
		System.out.println("Test Method 13");

	}
	@Test(groups = {"functional"})
	private void methodTest14() 
	{
		System.out.println("Test Method 14");

	}
	@Test(groups = {"sanity"})
	private void methodTest15() {
	
		System.out.println("Test Method 15");
	}
	@Test(groups = {"sanity"})
	private void methodTest16() {
	
		System.out.println("Test Method 16");
	}
	@Test(groups = {"sanity"})
	private void methodTest17() {
		System.out.println("Test Method 17");

	}
	@Test(groups = {"sanity"})
	private void methodTest18() {
		System.out.println("Test Method 18");

	}
	@Test(groups = {"sanity"})
	private void methodTest19() {
		
		System.out.println("Test Method 19");
	}
	@Test(groups = {"functional"})
	private void methodTest20() {
		System.out.println("Test Method 20");

	}
}
