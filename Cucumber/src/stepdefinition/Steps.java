package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

     WebDriver driver;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
     driver= new ChromeDriver(); 
     driver.get("https://www.linkedin.com/");
    		
		
	}

	@When("^the user enters the valid username and password$")
	public void the_user_enters_the_valid_username_and_password() throws Throwable {
		driver.findElementById("session_key").sendKeys("vimal");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc");	
	    
	}

	@When("^click on the login button$")
	public void click_on_the_login_button() throws Throwable {
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();   
	}

	@Then("^the user should be navigated to homelogin$")
	public void the_user_should_be_navigated_to_homelogin() throws Throwable {
		   boolean showingHomeText= driver.findElementByXPath("(//span[@class='nav-item__icon'])[1]").isDisplayed();
		   Assert.assertTrue(showingHomeText);
		
	    
	}
    
 
}
