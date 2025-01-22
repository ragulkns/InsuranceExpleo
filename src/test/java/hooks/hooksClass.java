package hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import driverInstance.drivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooksClass extends drivers {
	
	@Before
	public void browserLaunch(Scenario scenario) {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	        driver.get("http://192.168.99.141:3000/");
	        }
	
	
	@After
	public void quitBrowser() {
	    if (driver != null) {
	        driver.quit();
	    }
	}

}


