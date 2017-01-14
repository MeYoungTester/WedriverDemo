package com.demo.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Administrator on 2016/12/10.
 */
public class FindElementTest {
    WebDriver driver;

    @BeforeMethod
    public void open() {
//        chromedriver 路径
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
//        启动chrome浏览器
        driver = new ChromeDriver();
    }

    @Test
    public void testByID() {
        driver.get("http://www.baidu.com");
//        通过ID 定位
        WebElement element = driver.findElement(By.id("kw"));
        System.out.println(element);
    }

    @Test
    public void testByName() {
        driver.get("http://www.baidu.com");
//        通过 name定位
        WebElement element = driver.findElement(By.name("wd"));
        System.out.println(element);
    }

    @Test
    public void testByClassName() {
        driver.get("http://www.baidu.com");
//        通过class name  定位
        WebElement element = driver.findElement(By.className("s_ipt"));
        System.out.println(element);
    }

    @Test
    public void testByLinkText() {
        driver.get("http://www.baidu.com");
//        通过文本 定位
        WebElement element = driver.findElement(By.linkText("糯米"));
        System.out.println(element);
    }

    @Test
    public void testPartiaByLinkText() {
        driver.get("http://www.baidu.com");
//        通过部分文本定位
        WebElement element = driver.findElement(By.partialLinkText("糯"));
        System.out.println(element);
    }

    @Test
    public void testCSS() {
        driver.get("http://www.baidu.com");
//        通过CSS定位
        WebElement element = driver.findElement(By.cssSelector("#kw"));
        System.out.println(element);
    }

    @Test
    public void testTagname() {
        driver.get("http://www.baidu.com");
//        通过tagname定位
        driver.findElement(By.tagName("input")).sendKeys("webdriver");
//        System.out.println(element);
    }

    @Test
    public void testXpath() {
        driver.get("http://www.baidu.com");
//        通过xpath定位
        driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("webdriver");
//        System.out.println(element);
    }


    @Test
    public void testXpathFindelements() {
        driver.get("http://www.baidu.com");
//        通过class定位
        List<WebElement> webElements = driver.findElements(By.className("mnav"));
        for (int i = 0; i < webElements.size(); i++) {
            System.out.println(webElements.get(i));
        }

//        WebElement element = webElements.get(5);
//        System.out.println(element);
    }

    @AfterMethod
    public void closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
