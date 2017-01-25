package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver","/home/manoj/geckodriver");
		//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		String exePath = "/home/manoj/selenium-java-3.0.1/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
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
