package com.demo.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2016/12/15.
 */
public class WindowTest {

    WebDriver driver;

    @BeforeMethod
    public void openChrome() {
        System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void winTest(){
        driver.get("file:///C:/selenium_html/index.html");
        driver.findElement(By.linkText("Open new window")).click();
//         获取当前 win 的句柄
        String hadles1 = driver.getWindowHandle();
//          获取所有的win 窗口句柄， 并逐个跟 hadles1 做匹配
        for(String hadles : driver.getWindowHandles()){
            if(hadles.equals(hadles1)){
                continue;
            }
            driver.switchTo().window(hadles);
        }

        driver.findElement(By.id("user")).sendKeys("new window");

    }

    @AfterMethod
    public void closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
