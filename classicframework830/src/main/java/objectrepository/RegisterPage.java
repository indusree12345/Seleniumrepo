package objectrepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "Register")
	private WebElement loginLink;

	public WebElement getRegisterLink() {
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

	@FindBy(id = "Register")
	private WebElement registerbutton;

	public WebElement getRegisterButton() {
		return registerbutton;
	}
}

