package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3Gmail {


        public static void main(String[] args) {
            // TC #3: Back and forth navigation
            //  1- Open a chrome browser
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            // 2- Go to: https://google.com
            driver.get("https://google.com");
            // 3- Click to Gmail from top right.
            //  4- Verify title contains:
            WebElement gmail= driver.findElement(By.className("gb_m"));

            // Expected: Gmail
            String expectedInTitle="Gmail";
            String actualTitle=driver.getTitle();
            //5- Go back to Google by using the .back();
            driver.navigate().back();

            // 6- Verify title equals:
            // Expected: Google
            String expectedInTitle2="Gmail";
            String actualTitle2=driver.getTitle();
            if (expectedInTitle2.equals(actualTitle2)){
                System.out.println("passed!!!");
            }else {
                System.out.println("failed!!!");
            }

        }
    }
  /*
    public class HomeWork4 {
        public static void main(String[] args) {
            //TC #4: Practice Cydeo – Class locator practice
            //1- Open a Chrome browser
            WebDriverManager.chromedriver().setup();
            WebDriver driver= new ChromeDriver();

            //2- Go to: https://practice.cydeo.com/inputs
            driver.get("https://practice.cydeo.com/inputs");
            //3- Click to “Home” link
            //PS: Locate “Home” link using “className” locator
            WebElement homeLink= driver.findElement(By.className("nav-link"));
            homeLink.click();
            //4- Verify title is as expected:
            //Expected: Practice

            String expectedInTitle="practice";
            String actualTitle=driver.getTitle();
            if (expectedInTitle.equals(actualTitle)){
                System.out.println("passed!!");
            }else {
                System.out.println("failed!");
            }
     //       driver.quit();


        }
}


   */