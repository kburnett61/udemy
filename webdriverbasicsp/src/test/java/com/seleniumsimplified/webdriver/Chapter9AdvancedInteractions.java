package com.seleniumsimplified.webdriver;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.*;

/**
 * Created with IntelliJ IDEA.
 * User: STGUser
 * Date: 12/6/13
 * Time: 12:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class Chapter9AdvancedInteractions {
    WebDriver driver;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("http://book.theautomatedtester.co.uk/demo2.html");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testExamples(){
        WebElement someElement = driver.findElement(By.className("draggable"));
        WebElement otherElement = driver.findElement(By.className("droppable"));

        Actions builder = new Actions(driver);
        Action dragAndDrop = builder.clickAndHold(someElement)
                .moveToElement(otherElement)
                .release(otherElement)
                .build();

        dragAndDrop.perform();
    }
}
