package TestNgTutorials.TestNgTutorials.attributesInTestNG;

import org.testng.annotations.Test;

public class InvocationCountAttribute 
{
	/*In TestNG, the invocationCount attribute is used to specify the number of times a test method should be invoked during a test run.
	 *  This attribute is particularly useful when you want to execute a test method multiple times with the same 
	 *  or different inputs to verify its behavior under various conditions.*/
  @Test(invocationCount = 3)
  public void testMethod() 
  {
	  System.out.println("invocation count testing");
  }
}
