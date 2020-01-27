import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Login{
	
		
		By tf_UserName= By.xpath("//input[@name='userName']");
		By tf_Password= By.xpath("//input[@name='password']");
		By btn_Login= By.xpath("//input[@name='login']");
		
		
		
		TestBase test= new TestBase();
		
		
		// open the web application
		public void openApplication(WebDriver driver, String url) {
			test.open(driver, url);	
		}
		
		//Enter the userName
		public void enterUsername(WebDriver driver, String userName) {
			test.type(driver,tf_UserName, userName);
		}
		
		//Enter the password
		public void enterpassword(WebDriver driver,  String Password) {
			test.type(driver,tf_Password, Password );			
		}
		
		//submit the credentials
		public void clickonSubmit(WebDriver driver) {
			test.click(driver, btn_Login);
		}
		
		
		
		
}
		