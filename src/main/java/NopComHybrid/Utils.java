package NopComHybrid;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage

{
    public static void waitForClickable(By by,int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static String timeStamp()
    {
        DateFormat dateFormat = new SimpleDateFormat("ddmmyyhhmmss");
        Date date=new Date();
        return dateFormat.format(date);
    }
    public static void dropDownIndex(By by, int number) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(number);
    }
    public static void dropDrownVisibletext(By by, String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public String dropDownGetSelectedText(By by)
    {
        Select select = new Select(driver.findElement(by));
        return select.getFirstSelectedOption().getText();
    }
    public static void scrollAndClick(By by){
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    public static void clickOnElement(By by)

    {
        driver.findElement(by).click();
    }

    public static void clearAndEnterText(By by, String text)
    {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    public static void EnterText(By by,String text)
    {
        driver.findElement(by).sendKeys(text);

    }
    public static String getTextElement(By by)
    {
        return driver.findElement(by).getText();

    }
    public static void assertTextMessage(By by,String expected, String message)
    {
        Assert.assertEquals(getTextElement(by),expected,message);
    }
    public static void assertURL(String text)
    {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));

    }
    public static void sleep(int time){
        try {
            Thread.sleep(time *1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
