package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginSuccessPage;
import pages.RegisterPage;
import pages.SignOnPage;

public class HomePageTest extends TestBase{
	HomePage hp;
	SignOnPage sop;
	RegisterPage rp;
	
	@BeforeTest
	public void loadBrowser() {
		initialization();
		hp = new HomePage();
		sop = new SignOnPage();
		rp = new RegisterPage();
	}
	
	@AfterTest
	public void closeBrowser() {
		tearDown();
	}
	
	@Test
	public void signOnlinkTest() {
		hp.clickSignOnLink();
		Assert.assertEquals(sop.getSignOnPageTitle(), "Sign-on: Mercury Tours");
	
	}
	
	@Test
	public void RegisterlinkTest() {
		hp.clickRegisterLink();
		Assert.assertEquals(rp.getRegisterPageTitle(), "Register: Mercury Tours");
	
	}
}
