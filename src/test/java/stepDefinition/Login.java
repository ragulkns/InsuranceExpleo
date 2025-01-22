package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import driverInstance.drivers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends drivers {

	
	@When("User Enter Username and Password")
	public void user_enter_username_and_password() throws InterruptedException {
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		username.sendKeys("ragul.duraisamy@expleogroup.com");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("Expleo@123");
	}

	@When("User should click the LoginButton")
	public void user_should_click_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(3000); 
		System.out.println("Login Successful");
	}

	@Then("Login Should be successful")
	public void login_should_be_successful()  {
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		 WebElement logout =  driver.findElement(By.xpath("//button[text()='Logout']"));
	        
			Actions act = new Actions(driver);
			act.click(logout).build().perform();
			System.out.println("LogOut Successful");
		
	}
}


