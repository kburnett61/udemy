package com.seleniumsimplified.webdriver;

import org.junit.*;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created with IntelliJ IDEA.
 * User: STGUser
 * Date: 12/11/13
 * Time: 2:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Chapter11CapturingBase64Images {

    /*WebDriver driver;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    //Save screenshot in Base 64
    public void takeScreenShotAsBase64Strings(){
        driver.get("http://book.theautomatedtester.co.uk");
        String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
    }

    @Test
    //Save screenshot as a byte string
    public void takeScreenShotAsBytes(){

        driver.get("http://book.theautomatedtester.co.uk");
        byte[] screenbytes = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    @Test
    //Save screenshot as a file
    public void takeScreenShotAsFile(){

        driver.get("http://book.theautomatedtester.co.uk");
        File savedImage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    }*/
}

