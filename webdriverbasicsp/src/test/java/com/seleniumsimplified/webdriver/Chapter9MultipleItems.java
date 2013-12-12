package com.seleniumsimplified.webdriver;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: STGUser
 * Date: 12/9/13
 * Time: 12:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Chapter9MultipleItems {

    WebDriver driver;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("http://book.theautomatedtester.co.uk/multi-select.html");
    }

    @After
    public void tearDown(){
        //driver.quit();
    }

    @Test
    public void testMultipleItemsExamples(){

        Actions builder = new Actions(driver);

        WebElement select = driver.findElement(By.id("selectWithMultipleEqualsMultiple"));

        //List<WebElement> options = select.findElements(By.tagName("options"));
        List<WebElement> options = select.findElements(By.tagName("option"));

        Action multipleSelect = builder.keyDown(Keys.SHIFT)
                .click(options.get(0))
                .click(options.get(2))
                .build();

        multipleSelect.perform();
    }
}
