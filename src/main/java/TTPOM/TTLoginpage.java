package TTPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TTLoginpage {
	
	@FindBy(id="user")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;
	
	//@FindBy(xpath = "//input[@id='birtUrl']")
	@FindBy(xpath="//button[@class='btn btn-block btn-info-custom margin-top-04']")
	public WebElement Loginbutton;
	

public TTLoginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void enterusername() {
	username.sendKeys("admin");
}
public void enterpassword() {
	password.sendKeys("tech8092");
}
public void pressLoginbutton() throws InterruptedException {
	    Thread.sleep(5000);
		Loginbutton.click();
		System.out.println("click completed");
		
		
}

}
