package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC7_NonSelectDropdownTask {

    //TC #7: Selecting value from non-select dropdown

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

    @Test
    public void selectValueFromNonSelectDropdownTest(){
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

        //3. Click to non-select dropdown
        WebElement nonSelectDropdown = driver.findElement(By.cssSelector("#dropdownMenuLink"));
        nonSelectDropdown.click();

        //4. Select Facebook from dropdown
        WebElement facebook = driver.findElement(By.linkText("Facebook"));
        facebook.click();

        //5. Verify title is “Facebook - Log In or Sign Up”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";

        // Test fails, because actual title is "Facebook – log in or sign up"
        Assert.assertEquals(actualTitle,expectedTitle);

    }
}
