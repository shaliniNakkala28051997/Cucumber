

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtility {
	static public WebDriver getDriver(String browser)
	{
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shalini.nakkala\\Downloads\\chromedriver_win32\\chromedriver.exe");
		return new ChromeDriver();
		}
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\shalini.nakkala\\Downloads\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
			return new InternetExplorerDriver();
			
		}
		else
			
		{
			return null;
		}
	
	}
	
	
	
	

}
