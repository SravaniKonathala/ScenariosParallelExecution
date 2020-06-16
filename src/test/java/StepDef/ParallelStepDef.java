package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelStepDef {
	
	WebDriver driver;
	
	@Given("I launch the Chrome driver")
	public void i_launch_the_Chrome_driver() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	    
	}

	@Then("I launch the google application")
	public void i_launch_the_google_application() {
	   driver.get("http://www.google.co.uk");
	    
	}

	@Given("I launch the Firefox driver")
	public void i_launch_the_Firefox_driver() {
		WebDriverManager.firefoxdriver().setup();
		   driver = new FirefoxDriver();
	    
	}

	@Then("I launch the yahoo application")
	public void i_launch_the_yahoo_application() {
	   
		driver.get("http://www.yahoo.co.uk");
	}
	@Then("I close the browser")
	public void i_close_the_browser() {
	    driver.close();
	}
	
	@Then("I search for {string}	and name is {string}")
	public void i_search_for_and_name_is(String searchItem, String name) {
	    WebElement search = driver.findElement(By.name(name));
		search.sendKeys(searchItem);
		search.sendKeys(Keys.ENTER);
	    }
}
