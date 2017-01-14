package com.demo.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/1/7.
 */
public class SendEmailTest {

    WebDriver driver;

    @BeforeMethod
    public void openChrome() {
        System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closed() throws InterruptedException {

//        Thread.sleep(5000);
//        driver.quit();
    }

    @Test
    public void testSendEmail(){
        driver.get("http://mail.163.com/");
        LoginDemo.loign(driver,"meyoungtester","meyoung123");

        driver.findElement(By.xpath(".//*[@id='dvNavTop']/ul/li[2]/span[2]")).click();
        driver.findElement(By.xpath(".//*[@aria-label='收件人地址输入框，请输入邮件地址，多人时地址请以分号隔开']")).sendKeys("meyoungtester@163.com");
        driver.findElement(By.xpath(".//*[@aria-label='邮件主题输入框，请输入邮件主题']/input")).sendKeys("test");

        driver.findElement(By.xpath(".//*[@title='一次可发送2000张照片，600首MP3，一部高清电影']/input")).sendKeys("E:\\Desktop\\D.png");

        WebElement iframe1 = driver.findElement(By.className("APP-editor-iframe"));
        driver.switchTo().frame(iframe1);

        driver.findElement(By.xpath("html/body")).sendKeys("asdfb");

        driver.switchTo().defaultContent();
        driver.findElement(By.xpath(".//*[text()='发送']")).click();

        Boolean success = driver.findElement(By.xpath(".//*[text()='发送成功']")).isDisplayed();
        Assert.assertTrue(success);

    }
}
