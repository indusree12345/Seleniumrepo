package register;

import org.testng.annotations.Test;

import genericutlity.BaseClass2;

public class Register_Test extends BaseClass2 {
	@Test
	public void LoginToDemoWebshop() {
		register.getRegisterLink().click();
		register.getUserName().sendKeys("indu94820@gmail.com");
		register.getPassword().sendKeys("123456");
		register.getRegisterButton().click();
	}
}

