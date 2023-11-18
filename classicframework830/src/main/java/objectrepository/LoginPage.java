package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "login")
	private WebElement loginLink;

	public WebElement getLoginLink() {
		return loginLink;
	}

	@FindBy(id = "username")
	private WebElement username;

	public WebElement getUserName() {
		return username;
	}

	@FindBy(id = "password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(id = "login")
	private WebElement loginbutton;

	public WebElement getLoginButton() {
		return loginbutton;
	}
}
