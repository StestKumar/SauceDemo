package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

//Everything Browser Related In Here
public class BrowserManager extends Utility
{

    LoadProp loadProp = new LoadProp();
    String browser = loadProp.getProperty("browser");

    String sauceUrl = loadProp.getProperty("sauceurl");

    //boolean cloud = false;
    boolean cloud = Boolean.parseBoolean(System.getProperty("cloud"));


    //Creating a Browser
    public void openBrowser()
    {


        if (cloud)
        {
            System.out.println("Running on cloud using sauceLab");
            if (browser.equalsIgnoreCase("Chrome"))
            {
                System.out.println("Browser is chrome");
                ChromeOptions browserOptions = new ChromeOptions();
                browserOptions.setPlatformName("Windows 11");
                browserOptions.setBrowserVersion("latest");

                try
                {
                    driver = new RemoteWebDriver(new URL(sauceUrl), browserOptions);
                } catch (MalformedURLException e)
                {
                    throw new RuntimeException(e);
                }


            } else if (browser.equalsIgnoreCase("Firefox"))
            {
                System.out.println("your browser is firefox");
                FirefoxOptions browserOptions = new FirefoxOptions();
                browserOptions.setPlatformName("Windows 11");
                browserOptions.setBrowserVersion("123");
                try
                {
                    driver = new RemoteWebDriver(new URL(sauceUrl), browserOptions);
                } catch (MalformedURLException e)
                {
                    throw new RuntimeException(e);
                }
            } else if(browser.equalsIgnoreCase("Safari"))
                {
                    System.out.println("your browser is Safari");
                    SafariOptions browserOptions = new SafariOptions();
                    browserOptions.setPlatformName("macOS 12");
                    browserOptions.setBrowserVersion("16");

                    try
                    {
                        driver = new RemoteWebDriver(new URL(sauceUrl), browserOptions);
                    } catch (MalformedURLException e)
                    {
                        throw new RuntimeException(e);
                    }


                }
        } else

        {
            System.out.println("Running on local");
            if (browser.equalsIgnoreCase("chrome"))
            {
                driver = new ChromeDriver();
                System.out.println(loadProp.getProperty("browserName1"));

            } else if (browser.equalsIgnoreCase("firefox"))
            {
                driver = new FirefoxDriver();
                System.out.println(loadProp.getProperty("browserName2"));
            } else if (browser.equalsIgnoreCase("edge"))
            {
                driver = new EdgeDriver();
                System.out.println(loadProp.getProperty("browserName3"));
            } else
            {
                System.out.println(loadProp.getProperty("wrongBrowserMessage") + browser);
            }

        }
        //wait time for loading
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //method to maximize window
        driver.manage().window().maximize();
        //get url from properties
        driver.get(loadProp.getProperty("url"));

    }
    //method to close the browser
    public void closeBrowser()
    {
        driver.quit();
    }

}