package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.MainPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginTestDataDriven extends BaseClass{
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class )
	public void test_loginDataDriven(String username, String pwd, String res) {
		lg.info("--------------Starting TC_003_LoginTestDataDriven----------");
		try {
		LoginPage lp= new LoginPage(driver);
		lp.set_username(username);
		lp.setPassword(pwd);
		lp.click_LoginBtn();
		MainPage mp= new MainPage(driver);
		boolean status=mp.isLogoDisplayCheck();
		if(res.equals("valid"))
		if(status==true) {
			mp.clicklogoutBtn();
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		if(res.equals("invalid"))
			if(status==true) {
				mp.clicklogoutBtn();
				Assert.assertTrue(false);
			}
			else
				Assert.assertTrue(true);
		
	}
	catch(Exception e) {
		Assert.fail();
	}
	lg.info("--------------finished TC_003_LoginTestDataDriven-------------");
	}

}
