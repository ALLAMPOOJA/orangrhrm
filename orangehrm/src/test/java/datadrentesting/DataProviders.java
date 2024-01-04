package datadrentesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders
{
	@Test(dataProvider = "Tickets")
	public void datafortickets(String src, String dest)
	{
		System.out.println("From: "+ src + " \t " + "To: " + dest);
	}
	@DataProvider
	public Object[][]  Tickets()
	{
		Object[][] obj= new Object[3][2];
		obj[0][0]= "Banglore";
		obj[0][1]=  "hyd";
		obj[1][0]= "Goa";
		obj[1][1]= "Hyd";
		obj[2][0]= "US";
		obj[2][1]= "Banglore";
		return obj;
		
	}
	
 
}
