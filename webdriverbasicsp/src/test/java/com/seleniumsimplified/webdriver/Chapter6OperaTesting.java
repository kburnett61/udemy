package com.seleniumsimplified.webdriver;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

import java.io.File;
import java.util.Dictionary;

/**
 * Created with IntelliJ IDEA.
 * User: STGUser
 * Date: 12/4/13
 * Time: 3:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Chapter6OperaTesting {

    /* WebDriver driver;

    @Before
    public void setUP(){
        driver = new OperaDriver();
        driver.get("http://book.theautomatedtester.co.uk/");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testExamples(){
        WebElement element = driver.findElement(By.linkText("Chapter 4"));
        element.click();

        //Assert that we only have 1 link
        Assert.assertEquals(1, driver.findElements(By.linkText("index")).size());
    } */
}
