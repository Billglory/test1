package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zerobankTask {
    public static void main(String[] args) {
        //  TC #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //  2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html ");

        //3. Verify header text
        //Expected: “Log in to ZeroBank”
        WebElement headerText=driver.findElement(By.className("page-header"));
        String expectedHeaderText="Log in to zero bank";
        String actualHeaderText=headerText.getText();
        if (actualHeaderText.contains(expectedHeaderText)){
            System.out.println("Passed!!");
        }else {
            System.out.println("Failed");
        }
      //  driver.quit();
    }
}
