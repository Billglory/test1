import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class group13test1 {


    public class TC1 {
        WebDriver driver;

        @BeforeMethod
        public void setUp() {
//1. Launch browser
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @Test
        public void testName() {

//2. Navigate to url 'http://automationexercise.com'
            driver.get("http://automationexercise.com");
//3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
            WebElement signUpLink = driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
            signUpLink.click();
//5. Verify 'New User Signup!' is visible
//6. Enter name and email address
            WebElement signUpName = driver.findElement(By.xpath("//input[@name='name']"));
            signUpName.sendKeys("this is a fake name");
            WebElement signUpMail = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
            signUpMail.sendKeys("thisisnotafakemail@fakemail.com");
//7. Click 'Signup' button
            WebElement signUpBtn = driver.findElement(By.cssSelector("button[data-qa='signup-button']"));
            signUpBtn.click();
//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
            System.out.println("driver.findElement(By.tagName(\"h2\")).getText() = " + driver.findElement(By.tagName("h2")).getText());
//9. Fill details: Title, Name, Email, Password, Date of birth
            WebElement titleBtn = driver.findElement(By.cssSelector("input[id='id_gender1']"));
            titleBtn.click();
            WebElement passWord = driver.findElement(By.id("password"));
            passWord.sendKeys("abcd");

            Select select = new Select(driver.findElement(By.id("days")));
            select.selectByIndex(11);

            Select select1 = new Select(driver.findElement(By.id("months")));
            select1.selectByValue("5");

            Select select2 = new Select(driver.findElement(By.id("years")));
            select2.selectByVisibleText("2014");

//10. Select checkbox 'Sign up for our newsletter!'
//11. Select checkbox 'Receive special offers from our partners!'
//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
//13. Click 'Create Account button'
//14. Verify that 'ACCOUNT CREATED!' is visible
//15. Click 'Continue' button
//16. Verify that 'Logged in as username' is visible
//17. Click 'Delete Account' button
//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        }

    }
}
