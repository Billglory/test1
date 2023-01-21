package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class work111 {

    WebDriver driver = Driver.getDriver();

    @Test
    public void todoList() throws InterruptedException {
        driver.get(" http://todomvc.com/");
        driver.findElement(By.xpath("//div[.='JavaScript']")).click();
        driver.findElement(By.xpath("//a[@href='examples/polymer/index.html']")).click();
        Thread.sleep(5000);
        WebElement todoList = driver.findElement(By.xpath("//input"));
        todoList.click();
        todoList.sendKeys("go home" + Keys.ENTER);
        todoList.sendKeys("fix the bugs" + Keys.ENTER);

        driver.findElement(By.xpath("//a[@href='#/active']")).click();
        WebElement todo2 = driver.findElement(By.xpath("(//label[@class='style-scope td-item'])[2]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(todo2).doubleClick().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).
                sendKeys(Keys.DELETE).sendKeys("todo two edited").perform();


    }
}
