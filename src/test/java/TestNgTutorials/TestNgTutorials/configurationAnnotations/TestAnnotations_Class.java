package TestNgTutorials.TestNgTutorials.configurationAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class TestAnnotations_Class 
{
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("{1}-->BeforeSuite Method Execute only one time");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("2}-->BeforeTestMethod Execute only one time");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("{3}-->Before Class Method Execute only one time");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("{4}-->Before Method will Execute before each test method");
	}
	
	public void test3_BootstrapListBox()
	{
		System.out.println("{5}-->Test Method 1");
	}
	
	public void test4_JQueryListBox()
	{
		System.out.println("{5}-->Test Method 2");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("{4}-->After method will execute after each test method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("{3}-->After Class Method Execute only one time");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("2}-->AfterTestMethod Execute only one time");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("{1}-->AfterSuite Method Execute only one time");
	}
}
