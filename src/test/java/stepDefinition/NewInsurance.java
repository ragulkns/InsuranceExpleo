package stepDefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driverInstance.drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewInsurance extends drivers {
	
	@Given("user is on the login page with valid credentials")
	public void user_is_on_the_login_page_with_valid_credentials() {
		driver.findElement(By.id("username")).sendKeys("ragul.duraisamy@expleogroup.com");
		driver.findElement(By.id("Password")).sendKeys("Expleo@123");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

	@When("user clicks the New Insurance")
	public void user_clicks_the_new_insurance() throws InterruptedException {
		Thread.sleep(1000);
		WebElement newInsurance = driver.findElement(By.xpath("//a[normalize-space()='New Insurance']"));
		newInsurance.click();
	}

	@When("user enters the {string} and {string} and {string} and {string}")
	public void user_enters_the_and_and_and(String Name, String Email, String Address, String Birthdate) {
		driver.findElement(By.xpath("//input[@id='Name']")).sendKeys(Name);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@name='Address']")).sendKeys(Address);
		driver.findElement(By.id("DateOfBirth")).sendKeys(Birthdate);
	}

	@When("user clicks the Gender")
	public void user_clicks_the_gender() throws InterruptedException {
		
		WebElement gender = driver.findElement(By.xpath("//input[@value='Female']"));
		gender.click();
		Thread.sleep(2000);
	    
	}

	@When("user enters {string} and {string} and {string} and {string}")
	public void user_enters_and_and_and(String PolicyType, String Coverage, String SumInsured, String Primium) throws InterruptedException {
		WebElement policyType = driver.findElement(By.name("policyType"));
		Select selectpolicyType = new Select(policyType);
		selectpolicyType.selectByIndex(2);
		Thread.sleep(3000);
		
		WebElement coverage = driver.findElement(By.name("coverage"));
		Select selectCoverage = new Select(coverage);
		selectCoverage.selectByValue("Term");
		Thread.sleep(2000);
		
		WebElement sumInsured = driver.findElement(By.name("SumInsured"));
		Select selectSumInsured = new Select(sumInsured);
		selectSumInsured.selectByVisibleText("1,00,000");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Premium")).sendKeys("10");
	}

	@When("user clicks the button")
	public void user_clicks_the_button() {
		driver.findElement(By.xpath("//input[@value='No']")).click();
	    
	}

	@Then("user clicks the submit")
	public void user_clicks_the_submit() {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	    
	}
}
