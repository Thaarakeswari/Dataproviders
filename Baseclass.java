package testngfullpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public ChromeDriver driver;
	
	
	  
	  @Parameters({"Url","uname","pwd"})
	
	@BeforeMethod
	public void precondition(String url, String username, String passsword)
	{
	
	
	
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	ChromeOptions options=new ChromeOptions();
	options.addArguments(" --disable-notifications");
	
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(passsword);
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();

}
	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}
}