package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginEample {
WebDriver driver;
	@Given("^I am on the demo website \"([^\"]*)\"$")
	public void i_am_on_the_demo_website(String string) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(string);
	}

	@When("^I type login = \"([^\"]*)\" and password = \"([^\"]*)\"$")
	public void i_type_login_and_password(String string1, String string2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement username = driver.findElement(By.name("Email"));
		WebElement password = driver.findElement(By.name("Password"));
		username.clear();
		username.sendKeys(string1);
		password.clear();
		password.sendKeys(string2);
	}

	@When("^I click sign-in button$")
	public void i_click_sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		submitBtn.click();
	}

	@Then("^I should get \"([^\"]*)\" text$")
	public void i_should_get_text(String string1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actualValue=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		assertEquals(actualValue,string1);
	}


}
