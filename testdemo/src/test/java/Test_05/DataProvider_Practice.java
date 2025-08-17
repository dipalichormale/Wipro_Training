package Test_05;

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DataProvider_Practice {
	WebDriver driver;
	
//	public void launchBrowser() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demowebshop.tricentis.com/login");
//	}
	
	@Test(dataProvider="loginTestData")
	public void login(String Email, String password) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		System.out.println("Logging In.");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Email']"))).sendKeys(Email);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(5000);
	}
	
    @DataProvider(name="loginTestData")
	public Object[][] loginData(){
		Object[][] data = new Object[1][2];
		data[0][0] = "rasha.reddy@gmail.com";
		data[0][1] = "rasha@12";
//		data[1][0] = "Admin";
//		data[1][1] = "admin123";
		return data;
	}
    
    public void afterTest() {
    	if(driver != null) {
    		driver.quit();
    	}
    }

}
