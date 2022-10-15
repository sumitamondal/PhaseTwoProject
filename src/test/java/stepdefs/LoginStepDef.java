package stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	
	WebDriver driver=Hooks.driver;

	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	   
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	@When("I enter the correct username as {string} and correct Password as {string}")
	public void i_enter_the_correct_username_as_and_correct_Password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   
		WebElement UserName= driver.findElement(By.id("user-name"));
		UserName.sendKeys("standard_user");
		
		WebElement Password =driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
		
	}

	@When("I click on the Login Button")
	public void i_click_on_the_Login_Button() {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement LoginBtn =driver.findElement(By.id("login-button"));
		LoginBtn.click();
	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  
		WebElement Error =driver.findElement(By.xpath("//h3[@data-test='error']"));
		String ActError=Error.getText();
		String ExpError="Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(ExpError, ActError);
	}


	@When("I enter the username as {string} and Password as {string}")
	public void i_enter_the_username_as_and_Password_as(String UserNameVal, String PasswordVal) {
	    // Write code here that turns the phrase above into concrete actions
	 
		WebElement UserName= driver.findElement(By.id("user-name"));
		UserName.sendKeys(UserNameVal);
		
		WebElement Password =driver.findElement(By.id("password"));
		Password.sendKeys(PasswordVal);
	}

}
