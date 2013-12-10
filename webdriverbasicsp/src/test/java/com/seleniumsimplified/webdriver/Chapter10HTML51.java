package com.seleniumsimplified.webdriver;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.android.AndroidDriver;

/**
 * Created with IntelliJ IDEA.
 * User: STGUser
 * Date: 12/10/13
 * Time: 9:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class Chapter10HTML51 {

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
    public void testApplicationCache(){
        //stuff
    }
}
