package stepdef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageMod.Logpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepst {
	
	public WebDriver driver;
	public Logpage lg ;
	

	@Given("User launch Firefox browser")
	public void user_launch_firefox_browser() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("TeamTracker/drivers/geckodriver.exe"));
		driver =new FirefoxDriver();
		lg = new Logpage(driver);
		Thread.sleep(9000);
	}

	@When("user open URL {string}")
	public void user_open_url(String url) throws InterruptedException {
	    driver.get(url);
	    Thread.sleep(9000);
	}

	@When("user enter user as {string} and password as {string}")
	public void user_enter_user_as_and_password_as(String username, String pwd) {
	   
		lg.setUser(username);
	   lg.setPassword(pwd);
	}

	@When("click on login")
	public void click_on_login() throws InterruptedException {
		lg.clickLogin();
		Thread.sleep(5000);
	    
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
		if (driver.getTitle().equalsIgnoreCase(title)) {
			System.out.println("Title validation passed");
		}else {
			System.out.println("Title validation Failed");
		}

	}

	@Then("Close browser")
	public void close_browser() {
		driver.close();
	   
	}
}
