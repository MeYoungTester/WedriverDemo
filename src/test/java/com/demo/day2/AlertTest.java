package com.demo.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2016/12/15.
 */
public class AlertTest {

    WebDriver driver;

    @BeforeMethod
    public void openChrome() {
//        System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void testAlert() throws InterruptedException {
//        打开地址
        driver.get("file:///C:/selenium_html/index.html");
//        定位并点击  button按钮
        driver.findElement(By.xpath("//*[@id=\"alert\"]/input")).click();
        Thread.sleep(3000);
//        driver 控制权移交给 alert 弹窗
        Alert alert = driver.switchTo().alert();
//        获取弹窗文本
        String text = alert.getText();
//        处理确定
        alert.accept();
        Assert.assertEquals(text,"请点击确定");

    }

    @Test
    public void confirmTest() throws InterruptedException {
        driver.get("file:///C:/selenium_html/index.html");
//        点击button按钮
        driver.findElement(By.xpath("//*[@id=\"confirm\"]/input")).click();
        Thread.sleep(3000);
//         driver 控制权转交给 alert
        Alert alert = driver.switchTo().alert();
//        点击取消
        alert.dismiss();
        Thread.sleep(3000);
//        点击确定
        alert.accept();

    }

    @Test
    public void promptTest() throws InterruptedException {
        driver.get("file:///C:/selenium_html/index.html");
//        定位并点击
        driver.findElement(By.xpath("//*[@id=\"prompt\"]/input")).click();
        Thread.sleep(3000);
//        driver 转交
        Alert prompt = driver.switchTo().alert();
//        prompt 上输入一段文本
        prompt.sendKeys("这个是一个prompt");
        Thread.sleep(3000);
//        处理确定
        prompt.accept();
        Thread.sleep(3000);
//        处理确定
        prompt.accept();
    }

    @AfterMethod
    public void closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
