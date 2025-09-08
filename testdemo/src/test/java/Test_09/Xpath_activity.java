package Test_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Xpath_activity {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void login() {
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
	}
	
	@Test
	public void homepage() throws InterruptedException {
	//single attribute
	//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Tanjiro");
	WebElement ab=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[1]/input[1]"));
	ab.sendKeys("Tanjiro");
	
	//multiple attribute
	driver.findElement(By.xpath("//input[@id='email'][@placeholder='Enter EMail']")).sendKeys("tanjiro@gmail.com");
	
	//ByUsing AND operator
	driver.findElement(By.xpath("//input[@class='form-control' and @id='phone']")).sendKeys("7810365689");
	
	//ByUsing OR Operator
	driver.findElement(By.xpath("//textarea[@class='form-control' or @id='textarea']")).sendKeys("Rajanna Sircilla");
	
	//inner text using radiobutton()
	driver.findElement(By.xpath("//label[text()='female']")).click();
	
	//using button
	driver.findElement(By.xpath("//input[@id='sunday']")).click();
	
	//dropdown
	
	//Approach-1
	/*WebElement dis=driver.findElement(By.xpath("//select[@id='country']"));
	Select dissp=new Select(dis);
	//dissp.selectByValue("usa");
	dissp.selectByVisibleText("Japan");
	Thread.sleep(2000);*/
	
	//Approach-2
	driver.findElement(By.xpath("//select[@id='country']/option[2]")).click();
	Thread.sleep(2000);
}
		
	@AfterClass
	public void afterClass() {
		System.out.println("closing the browser");
	    if (driver!=null) {
		   driver.quit();
		}
}
}
