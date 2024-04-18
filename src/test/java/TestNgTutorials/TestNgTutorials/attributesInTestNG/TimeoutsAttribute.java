package TestNgTutorials.TestNgTutorials.attributesInTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeoutsAttribute 
{
	/*
	 * In TestNG, the timeOut attribute allows you to specify the maximum time (in milliseconds) that a test method should take to execute. 
	 * If the test method exceeds this time limit, TestNG will consider it as a failure and move on to the next test
	 * 
	 * */
	
  @Test(timeOut = 5000)
  public void timeouts() 
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.get("https://www.amazon.in/");
  }
}
