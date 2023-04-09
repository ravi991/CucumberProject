package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MutipleScenario {
WebDriver browserObject;
	@Given("^user is on Google home page \"([^\"]*)\"$")
	public void user_is_on_Google_home_page(String string) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
op.addArguments("--remote-allow-origins=*");
        browserObject = new ChromeDriver(op);
        browserObject.get(string);
        System.out.println(string + "\t is the site");
	}

	@Then("^user enters keyword \"([^\"]*)\"$")
	public void user_enters_keyword(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		browserObject.findElement(By.name("q")).sendKeys(string);
        System.out.println(arg1 + "\t is the keyword");
	}

	@Then("^user submits the page$")
	public void user_submits_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		browserObject.findElement(By.name("btnK")).submit();
        System.out.println("\t submit here");
	}

	@Then("^user waits for (\\d+) seconds for google$")
	public void user_waits_for_seconds_for_google(int int1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(int1 * 1000);
        System.out.println("wait of 5 secs");
        browserObject.close();
	}

	@Given("^user is on GitHub home page \"([^\"]*)\"$")
	public void user_is_on_GitHub_home_page(String string) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");
        browserObject = new ChromeDriver();
        browserObject.get(string);
        System.out.println(string + "\t is the site");
	}

	@Then("^user waits for (\\d+) seconds for github$")
	public void user_waits_for_seconds_for_github(int int1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(int1 * 1000);
        System.out.println("wait of 5 secs");
        browserObject.close();
	}

	@Given("^user is on Twitter home page \"([^\"]*)\"$")
	public void user_is_on_Twitter_home_page(String string) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");
	        browserObject = new ChromeDriver();
	        browserObject.get(string);
	        System.out.println(string + "\t is the site");
	}

	@Given("^user waits for (\\d+) seconds for twitter$")
	public void user_waits_for_seconds_for_twitter(int int1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Thread.sleep(int1 * 1000);
	        System.out.println("wait of 5 secs");
	        browserObject.close();
	}


}
