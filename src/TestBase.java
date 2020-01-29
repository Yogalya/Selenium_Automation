import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestBase {

	
		//Assigning web driver to do open the browser with the URL
		public void open(WebDriver driver, String url) {
			try {
				driver.get(url);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		//Assigning web driver for clicking on the element
		public void click(WebDriver driver, By locator) {
			try {
				WebElement element = driver.findElement(locator);
				element.click();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		//Assigning web driver to enter the values 
		public void type(WebDriver driver, By locator, String value) {
			try {
				WebElement element = driver.findElement(locator);
				element.clear();
				element.sendKeys(value);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		//Selecting the element
		public void select(WebDriver driver, By locator, String value) {
			try {
				WebElement element= driver.findElement(locator);
				new Select(element).selectByVisibleText(value);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		//verifying the assert
		public void assertEquals (WebDriver driver, By locator, String value ) {
			
			try {
				WebElement element= driver.findElement(locator);
				Assert.assertEquals(element.getText(), value);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		//checking the conditions
		public void assertTrue(WebDriver driver, By locator, String value) {
			
			try {
				WebElement element= driver.findElement(locator);
				Assert.assertTrue(element.getText().contains(value), "Actual text does NOT contain the expected text: "+value+" in element");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
}
