package com.demo.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2016/12/13.
 */
public class SelectTest {
    WebDriver driver;

    @BeforeMethod
    public void open() {
//        chromedriver 路径
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
//        启动chrome浏览器
        driver = new ChromeDriver();
    }

    @Test
    public void selectTest1() throws InterruptedException {
        driver.get("file:///G:/selenium%20%E8%AF%BE%E7%A8%8B/selenium_html/index.html");
//       定位下拉框
        WebElement selectElement = driver.findElement(By.id("moreSelect"));
//        实例化一个 Select类
        Select select = new Select(selectElement);

        Thread.sleep(2000);
//        通过索引选取下拉框
        select.selectByIndex(2);
        Thread.sleep(2000);
//        通过 属性 value 选取下拉框
        select.selectByValue("huawei");

        Thread.sleep(2000);
//         通过 文本值 选取下拉框
        select.selectByVisibleText("xiaomi");
    }

    @AfterMethod
    public void closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
