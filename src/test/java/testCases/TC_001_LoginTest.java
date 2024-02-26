package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.MainPage;
import testBase.BaseClass;

public class TC_001_LoginTest extends BaseClass {
	@Test
	public void test_Login() {
		// TODO Auto-generated method stub
		try {
		LoginPage lp= new LoginPage(driver);
			lp.set_username(rb.getString("username"));
			lg.info("username set");
			lp.setPassword(rb.getString("pwd"));
			lg.info("password set");
			lp.click_LoginBtn();
			lg.info("login btn clicked");
			MainPage mp= new MainPage(driver);
			System.out.println(mp.verifyLogocheck());
			if(mp.verifyLogocheck().equals("Swag Labs")){
				System.out.println("testcase passed");
				lg.info("testcase passed");
			}
			else {
				System.out.println("testcase failed");
				lg.info("testcase failed");
			}
		}
			
	    catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}


