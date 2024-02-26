package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	
public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

@FindBy(xpath="//input[@id=\"user-name\"]")
WebElement username;

 @FindBy(id="password")
 WebElement pwd;


@FindBy(id="login-button")
WebElement login_btn;



public void set_username(String uname) {
	username.clear();
	username.sendKeys(uname);
}

public void setPassword(String pass) {
	pwd.clear();
	pwd.sendKeys(pass);
}

public void click_LoginBtn() {
	login_btn.click();
}



}
