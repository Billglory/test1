package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class work1111 {

    public static void main(String[] args) {
        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        Driver.getDriver().get("https://todomvc.com/");
        WebElement polymerLink = Driver.getDriver().findElement(By.xpath("//a[.='Polymer']"));
        polymerLink.click();

        WebElement todosInput = Driver.getDriver().findElement(By.xpath("//input[@id='new-todo']"));
        String firsToDo = "find a bug";
        String secondToDo = "fixed the bug";
        todosInput.sendKeys(firsToDo, Keys.ENTER);
        todosInput.sendKeys(secondToDo, Keys.ENTER);
        Actions action = new Actions(Driver.getDriver());

        WebElement secondToDoItem = Driver.getDriver().findElement(By.xpath("(//label[@class='style-scope td-item'])[2]"));
        BrowserUtils.sleep(1);

        action.doubleClick(secondToDoItem).doubleClick().sendKeys(Keys.DELETE, "create bug report(edited)", Keys.ENTER).perform();


    }
}