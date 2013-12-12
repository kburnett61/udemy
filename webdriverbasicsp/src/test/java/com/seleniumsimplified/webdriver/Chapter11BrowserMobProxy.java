package com.seleniumsimplified.webdriver;

import org.browsermob.core.har.Har;
import org.browsermob.proxy.ProxyServer;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.*;

import java.io.FileOutputStream;
import java.util.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created with IntelliJ IDEA.
 * User: STGUser
 * Date: 12/11/13
 * Time: 3:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class Chapter11BrowserMobProxy {

    //
    public void BrowseUsingMobProxy(){

        //Start the proxy
        ProxyServer server = new ProxyServer(9876);
        server.start();

        //Captures the mouse movements and navigates
        server.setCaptureHeaders(true);
        server.setCaptureContent(true);

        //get the Selenium proxy object
        Proxy proxy = server.seleniumProxy();

        //configure it as a desired capability
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PROXY, proxy);

        //start the browser up
        WebDriver driver = new FirefoxDriver(capabilities);

        //create a new HAR with the label "my.com"
        server.newHar("PageName");

        //open yahoo.com
        driver.get("http://book.theautomatedtester.co.uk");

        //get the HAR data
        FileOutputStream fos = null;
        File file;

        try {

                Har har = server.getHar();
                file = new File("c:/temp/har.txt");
                fos = new FileOutputStream(file);

                //if file doesn't exist, then create it
                if (!file.exists()) {
                    file.createNewFile();
                }

                har.writeTo(fos);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos !=null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //Shut down proxy and driver
         server.stop();
         driver.quit();
    }
}
