package com.cydeo.tests.day2_locators_getText_getAttribute;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class task2 {

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
    public void selectingValue(){

        WebElement NonSelectedDropdown = driver.findElement(By.id("dropdownMenuLink"));
        NonSelectedDropdown.click();

        WebElement facebook = driver.findElement(By.linkText("Facebook"));
        facebook.click();

        String expectedTitle = "Facebook – Log In or Sign Up";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);  // büyük küçük harften dolayı failed oldu
    }


}


/* TC #7: Selecting value from non-select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook – Log In or Sign Up”


TC #7: Seçimsiz açılır listeden değer seçme
1. Chrome tarayıcıyı açın
2. https://practice.cydeo.com/dropdown adresine gidin
3. Açılır listeyi seçmemek için tıklayın
4. Açılır menüden Facebook'u seçin
5. Başlığın “Facebook – Giriş Yap veya Kaydol” olduğunu doğrulayın

*/




