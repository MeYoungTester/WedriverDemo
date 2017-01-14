package com.demo.day6;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/1/7.
 */
public class EJS {

    @Test
    public void testJS() throws InterruptedException {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://www.baidu.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById(\"kw\").setAttribute(\"maxlength\",\"10\")");

        Thread.sleep(5000);
        driver.quit();

    }
}
