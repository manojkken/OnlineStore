package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/home/manoj/geckodriver");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		WebDriver driver = new FirefoxDriver(capabilities);
		
	       //Launch the Online Store Website
			driver.get("http://www.store.demoqa.com");
	 
	        // Print a Log In message to the screen
	        System.out.println("Successfully opened the website www.Store.Demoqa.com");
	 
			//Wait for 5 Sec
			Thread.sleep(5);
			
	        // Close the driver
	        driver.quit();
	   

	}

}
