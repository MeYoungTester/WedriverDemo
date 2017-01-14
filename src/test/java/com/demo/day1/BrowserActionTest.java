package com.demo.day1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2016/12/10.
 */
public class BrowserActionTest {

    WebDriver driver;

    @BeforeMethod
    public void open() {
//        chromedriver 路径
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
//        启动chrome浏览器
        driver = new ChromeDriver();
    }

    @Test
    public void test1() {
//        打开百度页面
        driver.get("http://www.baidu.com");
//        driver.navigate().to("http://www.baidu.com");
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://www.baidu.com");
        driver.get("http://www.google.com");
//        浏览器后退
        driver.navigate().back();
        Thread.sleep(3000);
//        浏览器前进
        driver.navigate().forward();
        Thread.sleep(3000);
//        刷新
        driver.navigate().refresh();
//
    }


    @Test
    public void test3() throws InterruptedException {
//        浏览器最大化
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("http://www.baidu.com");
        Thread.sleep(3000);
        driver.get("http://www.google.com");
    }


    @Test
    public void test4() {
//        设置浏览器大小
        Dimension dimension = new Dimension(500, 500);
        driver.manage().window().setSize(dimension);
    }

    @Test
    public void test5() {
        driver.get("http://www.baidu.com");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals("https://www.baidu.com/",url);
    }

    @Test
    public void testGetTitle() {
        //打开百度页面
        driver.get("http://www.baidu.com");
        //获取百度首页的title值
        String title = driver.getTitle();
        System.out.println("百度首页title：" + title);
        //校验title是不是百度首页
        Assert.assertEquals(title, "百度一下，你就知道");
    }

    @AfterMethod
    public void closedBrowser() throws InterruptedException {
        Thread.sleep(5000);
//        关闭浏览器
        driver.quit();
    }
}
