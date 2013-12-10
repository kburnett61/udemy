package com.seleniumsimplified.webdriver;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.*;

/**
 * Created with IntelliJ IDEA.
 * User: STGUser
 * Date: 12/9/13
 * Time: 5:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Chapter9MouseButton {

    /*WebDriver driver;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("http://www.theautomatedtester.co.uk/demo1.html");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testMouseClicks(){

        Actions builder = new Actions(driver);
        WebElement canvas = driver.findElement(By.id("tutorial"));

        Action dragAndDrop = builder.clickAndHold(canvas)
                .moveByOffset(-40, -60)
                .moveByOffset(20, 20)
                .moveByOffset(100, 150)
                .release(canvas)
                .build();

        dragAndDrop.perform();
    }*/
}
