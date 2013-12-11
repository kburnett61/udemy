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
 * Time: 5:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Chapter10BrowserOnlineOffline {

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

    @Test
    public void testTurnOffConnectivity(){
        BrowserConnection networkAwareDriver = (BrowserConnection)driver;
        networkAwareDriver.setOnline(false);
        Assert.assertFalse(networkAwareDriver.isOnline());
        networkAwareDriver.setOnline(true);
        Assert.assertFalse(networkAwareDriver.isOnline());
    }
}
