package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginSuccessPage extends TestBase{
	
	@FindBy(xpath="//table[@width='492']/tbody/tr[1]")
	WebElement LoginSuccessMsg;
	
	public LoginSuccessPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getLoginSuccessMsg() {
		return LoginSuccessMsg.getText();
	}

}
