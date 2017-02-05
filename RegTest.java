package firsttestngpackge;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegTest 
{
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void forTitle()
	{
		String expectedTitle="Title";
		String actualTitle="Titl1";
		
		//Assert.assertEquals(actualTitle, expectedTitle);
		
		softAssert.assertEquals(actualTitle, expectedTitle);
		
		softAssert.assertAll();
		
		
		
	}
}
