import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Login{
	
		
		By tf_UserName= By.xpath("//input[@name='userName']");
		By tf_Password= By.xpath("//input[@name='password']");
		By btn_Login= By.xpath("//input[@name='login']");
		
		
		
		TestBase test= new TestBase();
		
		
		
		public void openApplication(WebDriver driver, String url) {
			test.open(driver, url);	
		}
		
		
		public void enterUsername(WebDriver driver, String userName) {
			test.type(driver,tf_UserName, userName);
		}
		
		
		public void enterpassword(WebDriver driver,  String Password) {
			test.type(driver,tf_Password, Password );			
		}
		
		
		public void clickonSubmit(WebDriver driver) {
			
			test.click(driver, btn_Login);
		}
		
		
}
		