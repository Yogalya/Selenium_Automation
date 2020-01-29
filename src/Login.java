import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Login{
	
		
		By tf_UserName= By.xpath("//input[@name='userName']");
		By tf_Password= By.xpath("//input[@name='password']");
		By btn_Login= By.xpath("//input[@name='login']");
		
		
		By df_depart= By.xpath("//select[@name='fromPort']");
		By ai_arrival= By.xpath("//select[@name='toPort']");
		
		By tm_toMonth= By.xpath("//select[@name='toMonth'");
		By td_toDate= By.xpath("//select[@name='toMonth'");
		
		By al_airline= By.xpath("//select[@name='airline']");
		
		By btn_continue= By.xpath("//input[@name='findFlights']");
		By lbl_Text= By.xpath("");
		
		
		
		
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
		
		
		//select the departingFrom
		public void departingFrom(WebDriver driver, String df_value) {
			test.select(driver, df_depart, df_value);
			
		}
		
		
		//select the arrival place
		public void arrivingIN(WebDriver driver, String ai_value) {
			test.select(driver, ai_arrival, ai_value);
		}
		
		//select the arrival month
		public void selectToMonth(WebDriver driver, String tm_value) {
			test.select(driver, tm_toMonth, tm_value);
		}
		
		//select the arrival date
		public void selectToDate(WebDriver driver, String td_value) {
			test.select(driver, td_toDate, td_value);
		}
		
		
		public void selectAirline(WebDriver driver, String al_value) {
			test.select(driver, al_airline, al_value);
		}
		
		public void ClickonContinue(WebDriver driver) {
			test.click(driver, btn_continue);
		}
		
		public void verifyContainsText(WebDriver driver, String expectedText) {
			test.assertTrue(driver, lbl_Text, expectedText);
		}
		
			
		
}
		