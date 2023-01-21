package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_SelectingDropdownTask {

    WebDriver driver;

    @BeforeMethod

    public void setupMethod() {
        // 1. Open chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test

    public void selectStates(){

        Select states = new Select(driver.findElement((By.xpath("//select[@id='state']"))));

        states.selectByVisibleText("Illinois");
        states.selectByValue("VA");  // Virginia
        states.selectByIndex(5);   // California

        Assert.assertEquals(states.getFirstSelectedOption().getText(), "California");

    }

    @AfterMethod

    public void tearDown(){
    //    driver.quit();
    }

}

/* TC #5: Selecting state from State dropdown and verifying result
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index)
 */

