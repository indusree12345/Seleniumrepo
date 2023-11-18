package login;

import org.testng.annotations.Test;

import genericutlity.BaseClass;
public class Login_Test extends BaseClass{
	@Test
	public void LoginToDemoWebshop() {
		login.getLoginLink().click();
		login.getUserName().sendKeys("indu94820@gmail.com");
		login.getPassword().sendKeys("123456");
		login.getLoginButton().click();
	}
}
