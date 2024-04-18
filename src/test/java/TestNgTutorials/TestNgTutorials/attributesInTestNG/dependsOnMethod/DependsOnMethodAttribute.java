package TestNgTutorials.TestNgTutorials.attributesInTestNG.dependsOnMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsOnMethodAttribute 
{
	/*
	 * In TestNG, the dependsOnMethods attribute is used to specify dependencies between test methods. 
	 * This attribute ensures that certain test methods are executed only after the successful execution of other specified methods. 
	 * This feature is particularly useful when you have a set of tests that rely on the successful completion of other tests before they can run.
	 * 
	 */
	
	WebDriver driver;
	@Test
	private void method1() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(dependsOnMethods = {"method1"},alwaysRun = true)
	private void method2()
	{
		driver.get("https://www.irctc.co.in/nget/train-search");
	}
}
