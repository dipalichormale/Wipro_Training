package Test_07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class PracticeFormTest {
   WebDriver driver;
   PracticeFormPage formPage;
   @BeforeClass
   public void setup() {
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://demoqa.com/automation-practice-form");
       formPage = new PracticeFormPage(driver);
   }
   @Test
   public void fillFormAndSubmit() {
       formPage.enterFirstName("Tanjiro");
       formPage.enterLastName("Kamado");
       formPage.enterEmail("tanjiro@gmail.com");
       formPage.selectGenderMale();
       formPage.enterMobile("7834567857");
       formPage.enterDateOfBirth("01-jan-2001");  // Improve later to select actual date
       formPage.enterSubjects("Yoga");
       formPage.selectHobbiesReading();
       formPage.uploadPicture("C:\\Users\\kashi\\Pictures\\Screenshots.png");
       formPage.enterCurrentAddress("123 Main Street, City, Country");
       formPage.selectState("bandra");
       formPage.selectCity("Mumbai");
       formPage.clickSubmit();
       // Add assertions here to verify submission was successful (optional)
   }
//   @AfterClass
//   public void teardown() {
//       if (driver != null) {
//           driver.quit();
//       }
//   }
}


