package com.seleniumsimplified.webdriver;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

import java.io.File;
import java.util.Dictionary;

/**
 * Created with IntelliJ IDEA.
 * User: STGUser
 * Date: 12/2/13
 * Time: 3:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Chapter6Test {

    WebDriver driver;

    @Before
    public void setUp(){
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("browser.startup.homepage",
            "http://book.theautomatedtester.co.uk/chapter4");
        driver = new FirefoxDriver(profile);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    /*@Test
    public void testExamples(){
        WebElement element = driver.findElement(By.id("nextBid"));
        element.sendKeys("100");
    }*/



}
