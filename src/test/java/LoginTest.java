import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTest {
	
	public static WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
	}
	
	@Test
	public void doLogin()
	{
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/");
		driver.findElement(By.id("Email")).sendKeys("jwalaarunn@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("jrfgdsf");
		driver.findElement(By.id("signIn")).click();
		//Adding new comments for Jenkins Test
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
