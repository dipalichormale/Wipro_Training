package Test_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.Random;

public class DemoStore{

    WebDriver driver;
    WebDriverWait wait;
    String baseUrl = "https://demo.nopcommerce.com/";
    String email;
    String password = "Password";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 1, groups = {"register"})
    public void registerTest() {
        driver.get(baseUrl);
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("tanjoro");
        driver.findElement(By.id("LastName")).sendKeys("Kamado");

        email = "tanjiro" + new Random().nextInt(10000) + "@mail.com";
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
        driver.findElement(By.id("register-button")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("result")));
        String successMsg = driver.findElement(By.className("result")).getText();
        Assert.assertTrue(successMsg.contains("completed"), "Registration failed!");
        System.out.println("Registration successful for: " + email);
    }

    @Test(priority = 2, groups = {"login"},dependsOnGroups = {"register"})
    public void loginTest() {
        // The "Log out" button is visible only after successful registration.
    	// Wait for the success message to be invisible before clicking "Log out"
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("result")));

        // Now, click the "Log out" button
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log out"))).click();
        driver.findElement(By.linkText("Log in")).click();

        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.cssSelector("button.button-1.login-button")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("account")));
        String accountEmail = driver.findElement(By.className("account")).getText();
        Assert.assertEquals(accountEmail, email, "Login failed!");
        System.out.println("Login successful for: " + accountEmail);
    }
    
    // This test is kept as an example of a search test case.
    @Test(priority = 3, groups = {"smoke"})
    public void searchProduct() {
        driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
        driver.findElement(By.cssSelector("button.button-1.search-box-button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("product-title")));
        Assert.assertTrue(driver.findElement(By.className("product-title")).isDisplayed(), "Search failed!");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}