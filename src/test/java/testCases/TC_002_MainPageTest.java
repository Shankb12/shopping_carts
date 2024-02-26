package testCases;

import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.MainPage;
import testBase.BaseClass;

public class TC_002_MainPageTest extends BaseClass{
@Test
	public void MainpageTest() {
	LoginPage lp= new LoginPage(driver);
	lp.set_username(rb.getString("username"));
	lg.info("username set");
	lp.setPassword(rb.getString("pwd"));
	lg.info("password set");
	lp.click_LoginBtn();
	lg.info("login btn clicked");
	MainPage mp= new MainPage(driver);
	mp.scroll();
	mp.click_add_to_cart();
	
	}
}
