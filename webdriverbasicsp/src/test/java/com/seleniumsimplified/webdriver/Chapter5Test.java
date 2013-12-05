package com.seleniumsimplified.webdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.Dictionary;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: STGUser
 * Date: 11/26/13
 * Time: 12:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Chapter5Test {

    WebDriver driver;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("http://book.theautomatedtester.co.uk/chapter1");
        //driver.get("http://book.theautomatedtester.co.uk");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    /*@Test
    public void testExamplesFindElementById(){
        ((FindsById)driver).findElementById("verifybutton");
    }

    @Test
    public void testExampleFindElementsById(){
        List<WebElement> elements = ((FindsById) driver).findElementsById("verifybutton");
        Assert.assertEquals(1, elements.size());
    }

    @Test
    public void testExampleFindByName(){
        ((FindsByName) driver).findElementByName("selected(1234)");
    }

    @Test
    public void testExampleFindByClassName(){
         WebElement element = ((FindsByClassName)driver).findElementByClassName("storetext");
    }

    @Test
    public void testExampleFindElementsByClassName(){
        List<WebElement> elements = ((FindsByClassName) driver).findElementsByClassName("storetext");
        Assert.assertEquals(1, elements.size());
    }

    @Test
    public void testExampleFindElementViaXpath(){
        ((FindsByXPath) driver).findElementByXPath("//input[@id='verifybutton']");
    }

    @Test
    public void testExampleFindElementsByXPath(){
        List<WebElement> elements = ((FindsByXPath) driver).findElementsByXPath("//input");
        Assert.assertEquals(6, elements.size());
    }

    //needs the link to be "http://book.theautomatedtester.co.uk"
    @Test
    public void testExampleFindElementByLinkText(){
        ((FindsByLinkText) driver).findElementByLinkText("Chapter1");
    }

    //needs the link to be "http://book.theautomatedtester.co.uk"
    @Test
    public void testExampleFindElementByLinkText2(){
        List<WebElement> elements = ((FindsByLinkText) driver).findElementsByLinkText("Chapter1");
        Assert.assertEquals(1, elements.size());
    }

    //needs the link to be "http://book.theautomatedtester.co.uk"
    @Test
    public void testExampleFindElement(){
        driver.findElement(By.linkText("Chapter1"));
    }

    //needs the link to be "http://book.theautomatedtester.co.uk"
    @Test
    public void testExampleFindElements(){
        List<WebElement> elements = driver.findElements(By.linkText("Chapter1"));
        Assert.assertEquals(1, elements.size());
    }

    //needs the link to be "http://book.theautomatedtester.co.uk/chapter1"
    @Test
    public void testExampleTimeouts(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id='ajaxdiv']"));
    }

    //needs the link to be "http://book.theautomatedtester.co.uk/chapter1"
    @Test
    public void testExampleExplicitWaits(){
        WebElement element = (new WebDriverWait(driver, 10)).until(new ExpectedCondition<WebElement>(){
            @Override
            public WebElement apply(WebDriver d){
                return d.findElement(By.xpath("//div[@id='ajaxdiv']"));
        }});

    }*/
}