package com.seleniumsimplified.webdriver;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.*;

import java.io.File;
import java.util.Dictionary;

/**
 * Created with IntelliJ IDEA.
 * User: STGUser
 * Date: 12/5/13
 * Time: 11:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class Chapter6IETesting {

    File file;
    Dictionary dictionary;
    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.ie.driver", "C:/Selenium/Drivers/IE/IEDriverServer64.exe");
        driver = new InternetExplorerDriver();
        driver.get("http://book.theautomatedtester.co.uk/chapter4");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testIEExamples(){
        WebElement element = driver.findElement(By.id("bid"));
        Assert.assertEquals("50", element.getText());
    }
}
