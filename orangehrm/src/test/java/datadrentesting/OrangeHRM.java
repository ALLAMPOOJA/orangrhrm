package datadrentesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get(readData("url"));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(readData("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(readData("password"));
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	    

	}
	public static String readData(String key) throws FileNotFoundException
	{
		FileInputStream fis=null;
		fis=new FileInputStream("D:\\Selenium\\orangehrm\\prop.properties");
		Properties property= new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return property.getProperty(key);
		
		
	}

}
