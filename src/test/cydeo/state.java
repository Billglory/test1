import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class state {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

    @Test
    public void stateDropdownTest(){

        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

        // Finds select tag with "state" id
        Select states = new Select(driver.findElement(By.cssSelector("#state")));

        //3. Select Illinois
        states.selectByIndex(14);

        //4. Select Virginia
        states.selectByValue("VA");

        //5. Select California
        states.selectByVisibleText("California");

        //6. Verify final selected option is California.
        Assert.assertEquals(states.getFirstSelectedOption().getText(),"California");

        //Use all Select options. (visible text, value, index)
    }

}
