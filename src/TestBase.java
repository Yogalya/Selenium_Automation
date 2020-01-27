import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestBase {

	
	

		
		public void open(WebDriver driver, String url) {
			try {
				driver.get(url);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		public void click(WebDriver driver, By locator) {
			try {
				WebElement element = driver.findElement(locator);
				element.click();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
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
