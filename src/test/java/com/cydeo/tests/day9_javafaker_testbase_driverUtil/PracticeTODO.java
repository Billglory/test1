package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PracticeTODO {


        public WebDriver driver;

        @BeforeMethod
        public void setup_test() {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @Test
        public void test() {
            driver.get("https://todomvc.com/");
            WebElement javaScriptTab = driver.findElement(By.xpath("//div[@class='tab-content flex-auto center-center horizontal layout style-scope paper-tab']"));
            javaScriptTab.click();

            WebElement polymer = driver.findElement(By.xpath("//a[@href=\"examples/polymer/index.html\"]"));
            polymer.click();

            WebElement todosBox = driver.findElement(By.xpath("//input[@id='new-todo']"));
            todosBox.sendKeys("Practice1" + Keys.ENTER);

            WebElement todosBox2 = driver.findElement(By.xpath("//input[@id='new-todo']"));
            todosBox2.sendKeys("Practice2" + Keys.ENTER);

            Actions actions = new Actions(driver);

            WebElement editTodo = driver.findElement(By.xpath("(//label[@class='style-scope td-item'])[2]"));
            actions.doubleClick(editTodo).perform();


            WebElement editTodo2 = driver.findElement(By.xpath("//input[@id='edit'][1]"));
            actions.doubleClick(editTodo2).perform();
            editTodo2.sendKeys(Keys.chord(Keys.CONTROL, Keys.DELETE));
            editTodo2.sendKeys("That's enough for today");


        }
    }
