package TestNgTutorials.TestNgTutorials.attributesInTestNG;

import org.testng.annotations.Test;

public class EnableAttribute 
{
  @Test(enabled =  true)
  public void testMethod1()
  {
	  System.out.println("test method enabled true");
  }
  
  @Test(enabled =  false)
  public void testMethod2()
  {
	  System.out.println("test method enabled falses");
  }
}
