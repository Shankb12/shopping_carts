package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

	public MainPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div[@class='app_logo']")
	WebElement logocheck;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
	WebElement item1;
	@FindBy(xpath="//button[@id=\"react-burger-menu-btn\"]")
	WebElement hamburger;
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logoutbtn;
	
	public String verifyLogocheck() {
		try {
		return logocheck.getText();
		}
		 catch(Exception e) {
			 return e.getMessage();
		 }
	}
	
	public boolean isLogoDisplayCheck() {try {
		return logocheck.isDisplayed();
	}
	catch(Exception e) {
		return false;
	}
	}
	//scroll down the page till element is visible
	/*WebElement w= driver.findElement(By.xpath("//td[normalize-space()='Denmark']"));
	js.executeScript("arguments[0].scrollIntoView();",w);
	System.out.println(js.executeScript("return window.pageYOffset;"));
	*/
	public void scroll() {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();",item1);
			System.out.println(js.executeScript("return window.pageYoffset"));
	}
	public void click_add_to_cart() {
		item1.click();
	}
	
	public void clicklogoutBtn() {
		hamburger.click();
		logoutbtn.click();
	}

}
