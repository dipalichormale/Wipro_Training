package Day_22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class NopCommerceDemoStore {
	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void register() {
		driver.get("https://demo.nopcommerce.com/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/register?returnUrl=%2F']"))).click();
		
		System.out.println(driver.getTitle());
		
		wait.until(ExpectedConditions.elementToBeClickable(By.name("FirstName"))).sendKeys("Tanjiro");
		driver.findElement(By.name("LastName")).sendKeys("Kamado");
		driver.findElement(By.name("Email")).sendKeys("tanjiro@gmail.com");
		driver.findElement(By.name("Company")).sendKeys("Demon Slayers");
		driver.findElement(By.name("Password")).sendKeys("Admin@123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Admin@123");		
	}
	
//	@Test (priority=2)
//	public void login() {
//		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
////		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login?returnUrl=%2F']"))).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Email']"))).sendKeys("tanjiro@gmail.com");
//		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Admin@123");
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@text()='Log in']"))).click();
//
//	}
//	
	@Test
	public void launchGoogle() {
		driver.get("https://www.google.com/");
	}
	
	@AfterClass
	public void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}

}
