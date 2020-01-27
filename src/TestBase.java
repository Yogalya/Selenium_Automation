import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
		
}
