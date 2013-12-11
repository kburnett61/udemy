package com.seleniumsimplified.webdriver;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.html5.*;
import org.junit.Assert;

/**
 * Created with IntelliJ IDEA.
 * User: STGUser
 * Date: 12/10/13
 * Time: 11:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class Chapter10BrowserOnline {

    WebDriver driver;

    @Before
    public void setUp(){

        driver = new AndroidDriver();
        driver.get("http://book.theautomatedtester.co.uk");
    }

    @After
    public void tearDown(){

        driver.quit();
    }

    @Test
    public void testApplicationCache(){
        Assert.assertTrue(((BrowserConnection) driver).isOnline());
     }
}

