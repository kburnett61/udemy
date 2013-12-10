package com.seleniumsimplified.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;
import org.junit.*;
import org.openqa.selenium.*;


/**
 * Created with IntelliJ IDEA.
 * User: STGUser
 * Date: 12/9/13
 * Time: 11:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class Chapter6AndroidTesting {

    WebDriver driver;
    @Before
    public void setUp(){
        driver = new AndroidDriver();
        driver.get("http://book.theautomatedtester.co.uk/chapter4");
    }
    @After
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void testExamples(){
        WebElement element = driver.findElement(By.id("nextBid"));
        element.sendKeys("100");
    }
}
