package Test_02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations_2 {
	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void logIn() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@text()=' Login ']")).click();
	}
	
//	@Test(enabled="false")
//	public void NavigateToMyInfo() {
//		driver.findElement(By.xpath("//li[@class='oxd-main-menu-item active']")).click();
//	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
