package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SearchClass {
	WebDriver browserObject;
	@Given("^I am on google page \"([^\"]*)\"$")
	public void i_am_on_google_page(String string) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
op.addArguments("--remote-allow-origins=*");
		browserObject = new ChromeDriver(op);
		browserObject.get(string);
	}

	@When("^I search = \"([^\"]*)\"$")
	public void i_search(String string) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		browserObject.findElement(By.name("q")).sendKeys(string);
	}

	@When("^I click on google search button$")
	public void i_click_on_google_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		browserObject.findElement(By.name("btnK")).submit();
	    
	}


}
