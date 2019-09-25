package step_defination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
/**
 * 
 * @author Ayaz (ayazhamiya@gmail.com)
 *
 */

public class GoogleSearch {
	public static WebDriver driver;
	HomePage homePage;
	
	@Given("^I am on google home page$")
	public void homePage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		homePage = new HomePage(driver);
	}
	
	@When("I search for {string}")
	public void i_search_for(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    homePage.enterSearch(string);
	}
	
	@Then("search results for {string} are displayed")
	public void search_results_are_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(homePage.getTitleText().contains(string), "result title doesn't contain searched string");
		    driver.quit();
		}
		catch(AssertionError e) {
			  e.setStackTrace(new StackTraceElement[0]);
			  driver.quit();
			  throw e;
		  }
	}

}
