package genericutlity;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	public JavascriptUtility js;
	public LoginPage login;
	PropertyUtility ppt = new PropertyUtility();

	@BeforeClass
	public void launchingTheBrowser() throws IOException {
		if (ppt.readingDataFromPropertyFile("browser").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (ppt.readingDataFromPropertyFile("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(ppt.readingDataFromPropertyFile("username"));
	}

	@BeforeMethod
	public void loadingObject() {
		js = new JavascriptUtility();
		login = new LoginPage(driver);
		// pom objects
	}

	public void closingBrowser() {
		driver.quit();
	}
}
