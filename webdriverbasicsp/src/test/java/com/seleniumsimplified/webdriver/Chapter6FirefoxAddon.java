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
 * Time: 11:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class Chapter6FirefoxAddon {
    WebDriver driver;
    /*
    @Before
    public void setUp(){
        FirefoxProfile profile = new FirefoxProfile();
        //There is a problem with the line immediately below.  Need to email book company about it.
        //profile.addExtension("firebug.xpi");
        profile.setPreference("extensions.firebug.currentVersion","99.9");
        driver = new FirefoxDriver(profile);
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
    } */
}