package firsttestngpackge;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parametrization 
{
	@Test(dataProvider="getData")
	public void TestData(String username,int age,String result, String browser)
	{
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][4];
		
		// 1st row
		data[0][0]="U1";   data[0][1]=2;  data[0][2]="Pass"; data[0][3]="moz";
		
		// 2nd row
		data[1][0]="U1-1"; data[1][1]=21; data[1][2]="Pass"; data[1][3]="moz-1";
		
		// 3rd row
		data[2][0]="U1-2"; data[2][1]=22; data[2][2]="Pass"; data[2][3]="moz-2";
		
		return data;
		
		
	}
}
