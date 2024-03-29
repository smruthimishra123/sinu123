package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant
{
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		driver=new FirefoxDriver();
		//System.setProperty(chrome_key, chrome_value);
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(actitimeUrl);
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}

}
