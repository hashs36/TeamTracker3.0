package PageMod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logpage {
    public WebDriver ldriver;
    public Logpage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(id="user")
    @CacheLookup
    WebElement user;

    @FindBy(id="password")
    @CacheLookup
    WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-block btn-info-custom margin-top-04']")
    @CacheLookup
    WebElement Login;


    public void setUser(String username) {
        user.clear();
        user.sendKeys(username);
    }

    public void setPassword(String pwd) {
        password.clear();
        password.sendKeys(pwd);
    }

    public void clickLogin(){
        Login.click();
    }

}
