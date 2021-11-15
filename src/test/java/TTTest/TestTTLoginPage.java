package TTTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TTPOM.TTLoginpage;

public class TestTTLoginPage {
	public static TTLoginpage objTTLoginpage ;
	public static  WebDriver driver ; 
	
@BeforeClass
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:/Users/Harish.10/eclipse-workspace/TeamTracker/drivers/chromedriver.exe");
	
	//WebDriver driver = new FirefoxDriver();
	WebDriver driver = new ChromeDriver();
	
	objTTLoginpage= new TTLoginpage(driver);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://test.teamtracker.locationguru.in/");
	
}

@Test
public void TTLTest() throws Exception {
	
	objTTLoginpage.enterusername();
	objTTLoginpage.enterpassword();
	System.out.println("started");
	
	objTTLoginpage.pressLoginbutton();	
	System.out.println("started_3");
}
@AfterClass
public void afterClass() {
 driver.close();
}

}
