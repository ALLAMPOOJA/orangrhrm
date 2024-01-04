package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInTest
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		LogInPage login= new LogInPage(driver);
		Thread.sleep(3000);
		login.setusername("Admin");
		Thread.sleep(3000);
		login.setpassword("admin123");
		Thread.sleep(3000);
		login.clickloginbutton();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
