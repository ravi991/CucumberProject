package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MutipleLogin {
	WebDriver browserObject;
	
	@Given("^I am on the demo site login \"([^\"]*)\"$")
	public void i_am_on_the_demo_site_login(String string) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		browserObject = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(string);
	}

	@When("^I enter userName = \"([^\"]*)\" and password = \"([^\"]*)\"$")
	public void i_enter_userName_and_password(String string, String string2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement username = browserObject.findElement(By.name("Email"));
		WebElement password = browserObject.findElement(By.name("Password"));
		username.clear();
		username.sendKeys(string);
		password.clear();
		password.sendKeys(string2);
	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement submitBtn = browserObject.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		submitBtn.click();
	}

	@Then("^text to display \"([^\"]*)\" text$")
	public void text_to_display_text(String string) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actualValue=browserObject.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		assertEquals(actualValue,string);
	}


}
