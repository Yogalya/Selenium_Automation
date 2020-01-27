import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


	public class ExecuteTest extends TestBase {

	WebDriver driver= null;
		

		
		@BeforeMethod
		public void beforeMethod() {
			System.setProperty("webdriver.chrome.driver", "E:\\Auto_libraries\\New folder\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		
		
		@DataProvider
		public Object[][] dt_test001() {
			return new Object[][] { 
				new Object[] { "ayogalya@gmail.com", "test123"},
				
				
			};
		}
		
		
		
		
		@Test(dataProvider = "dt_test001")
		public void test001(String userName, String Password) {
			
			Login pageL = new Login();
			
			pageL.openApplication(driver,"http://newtours.demoaut.com/mercurywelcome.php");
			
		
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			pageL.enterUsername(driver, userName);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			pageL.enterpassword(driver, Password);
		
			
			
			pageL.clickonSubmit(driver);
		
			
			
		}
		
	}


