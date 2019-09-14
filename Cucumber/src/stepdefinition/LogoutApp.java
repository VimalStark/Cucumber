package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogoutApp {

	  WebDriver driver;
		
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
	     driver= new ChromeDriver(); 
	     driver.get("https://www.linkedin.com/");   
	}

	@When("^the user enters the valid input \"(.*?)\" and \"(.*?)\"$")
	public void the_user_enters_the_valid_input_and(String username, String password) throws Throwable {
		driver.findElementById("session_key").sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);	
	
	}

	@When("^clicks on the login button$")
	public void clicks_on_the_login_button() throws Throwable {
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();   
	}

	@Then("^the user should be navigated to homelogin$")
	public void the_user_should_be_navigated_to_homelogin() throws Throwable {
		public void the_user_should_be_navigated_to_homelogin() throws Throwable {
			   boolean showingHomeText= driver.findElementByXPath("(//span[@class='nav-item__icon'])[1]").isDisplayed();
			   Assert.assertTrue(showingHomeText);
	}

	@Then("^clicking on logout user should be loggued out successfully$")
	public void clicking_on_logout_user_should_be_loggued_out_successfully() throws Throwable {
		WebElement tester = driver.findElement(By.xpath("//span[text()='Me']")).click();
        Actions builder = new Actions(driver);
	    builder.dragAndDropBy(tester, 100, 40).perform();
	}

	}


	
	
}
