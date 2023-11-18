package genericutlity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavascriptUtility extends BaseClass{
 public void enteringDataIntoElement(WebElement element,String data)
 {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].value='"+data+"'",element);
 }
 public void clickingOnElement(WebElement element)
 {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();",element);
 }
 public void scrollingThePage(int x ,int y)
 {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("scrollBy("+x+","+y+")");
 }
}
