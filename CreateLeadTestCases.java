package testngfullpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateLeadTestCases extends Baseclass {

	@Test(dataProvider = "Read below")
	public void runcreate(String cname, String fname, String lname) {
		// TODO Auto-generated method stub
	
		
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Leads")));
		//driver.findElement(By.linkText("Leads")).click();
		//driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.className("smallSubmit")).click();
	}
		
		@DataProvider(name = "Read below")
		

	public  String[][] senddata() {
		// TODO Auto-generated method stub
		String[][] input= new String[1][3];
		input[0][0] ="Bari company";
		input[0][1] ="Albert";
		input[0][2] ="jill";
		
		return input;
	}
	}

