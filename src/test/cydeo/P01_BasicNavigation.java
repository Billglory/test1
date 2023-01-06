package test;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.facebook.com");
        System.out.println(driver.getTitle());



/*
    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();

    driver.navigate().to("https://www.google.com");

   // driver.get("https://www.google.com");

    driver.navigate().back();

    driver.navigate().forward();

    driver.navigate().refresh();



 */

}


    }


