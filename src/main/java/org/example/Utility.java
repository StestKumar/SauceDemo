package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Utility extends BasePage
{
    static LoadProp loadProp = new LoadProp();

    //Created a variable for email
    public static String email = loadProp.getProperty("emailPart1")+ randomDate() + loadProp.getProperty("emailPart2");

    //Created a variable for password
    public static String password = loadProp.getProperty("password");

    //Method To Find Element By Locators
    public static void findByElement(By by)
    {
        driver.findElement(by).click();
    }

    //Method To Find Text
    public static void findText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    //Method To Get Text Of Element
    public static String getTextOfElement(By by)
    {
        driver.findElement(by).getText();
        return driver.findElement(by).getText();
    }
    //Method For Timestamp
    public static String randomDate()
    {
        DateFormat Dateformat = new SimpleDateFormat("ddMMyyyyhhmm");
        Date date = new Date();
        return Dateformat.format(date);
    }
    public static void selectByVisibleText(By by, String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void selectByValue(By by, String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }
    public static void selectByIndex(By by, int num)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(num);
    }
    public static void takeScreenShot(String text)
    {
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        //Call getScreenshotAs method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        try {
            FileUtils.copyFile(SrcFile, new File("src\\Screenshot\\" + text + randomDate() + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
    public static void implicitlyWait()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

//method to get Css Value
    public static String getCssValue(By by,String text)
    {
        return driver.findElement(by).getCssValue(text);
    }


    public static void waitUntilElementIsVisible(int time, By by)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitUntilElementIsClickable(int time, By by)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    //sleep method
    public static void sleep(int time)
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void waitForElementToBePresent(int time, By by)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void explicitWait(int time, By by)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));

    }

    public static void waitForTextToBePresentInElement(int time, By by)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(by, "Expected Text"));
    }

    public static void waitForElementAttributeValue(int time, By by)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.attributeToBe(by, "attributeName", "expectedvalue"));
    }

    public static void waitForFrameToBeAvailableAndSwitchIt(int time, By by)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
    }



}

