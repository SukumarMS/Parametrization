package firsttestngpackge;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGFile
{
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("Enter");
  }
  
  @Test
  public void Test_1()
  {
	  // Insertion of Webdriver commands
	  System.out.println("Check_1");
  }
  
  @Test
  public void Test_2()
  {
	  // Insertion of Webdriver commands
	  System.out.println("Check_2");
  }
  
  @Test
  public void Test_3()
  {
	  // Insertion of Webdriver commands
	  System.out.println("Check_3");
  }
  
  @AfterTest
  public void afterTest()
  {
	  System.out.println("Exit");
  }
  
}
