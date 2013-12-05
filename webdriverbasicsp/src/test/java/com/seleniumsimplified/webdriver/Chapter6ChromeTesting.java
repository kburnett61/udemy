package com.seleniumsimplified.webdriver;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created with IntelliJ IDEA.
 * User: STGUser
 * Date: 12/4/13
 * Time: 1:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Chapter6ChromeTesting {

    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Selenium/Drivers/Chrome/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://book.theautomatedtester.co.uk/chapter4");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testExamples(){
        WebElement element = driver.findElement(
                By.id("selectLoad"));
        String value = element.getAttribute("value");
        Assert.assertEquals("Click to load the select below",
                value);
    }
}
