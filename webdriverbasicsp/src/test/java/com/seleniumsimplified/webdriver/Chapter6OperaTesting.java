package com.seleniumsimplified.webdriver;

import org.junit.*;
import org.openqa.selenium.*;
import com.opera.core.systems.OperaDriver;
import com.opera.core.systems.OperaProfile;

import java.io.File;
import java.util.Dictionary;

/**
 * Created with IntelliJ IDEA.
 * User: STGUser
 * Date: 12/4/13
 * Time: 3:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Chapter6OperaTesting {

    /*WebDriver driver;

    @Before
    public void setUP(){
        OperaProfile profile = new OperaProfile();
        profile.preferences().set("Geolocation", "Enable geolocation", false);
        driver = new OperaDriver(profile);
        driver.get("http://book.theautomatedtester.co.uk/");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testExamples(){
        WebElement element = driver.findElement(By.linkText("Chapter4"));
        element.click();

        //Assert that we only have 1 link
        Assert.assertEquals(0, driver.findElements(By.linkText("index")).size());
    } */
}
