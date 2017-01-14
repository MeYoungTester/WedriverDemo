package com.demo.day2;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;


/**
 * Created by Administrator on 2016/12/10.
 */
public class ActionsTest {

    WebDriver driver;

    @BeforeMethod
    public void open() {
//        chromedriver 路径
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
//        启动chrome浏览器
        driver = new ChromeDriver();

    }

    /**
     * 1. 打开百度
     * 2. 点击 糯米 链接
     */
    @Test
    public void clickTest() {
//        打开百度首页
        driver.get("http://www.baidu.com");
        driver.findElement(By.name("tj_trnuomi")).click();
////        定位 糯米按钮
//        WebElement element = driver.findElement(By.name("tj_trnuomi"));
////        点击 糯米按钮
//        element.click();
    }

    /**
     * 1. 打开百度
     * 2. 搜索框输入“webdriver”
     * <p>
     * 3. 再次清空搜索文本
     */
    @Test
    public void sendkeysTest() throws InterruptedException {
//        打开百度首页
        driver.get("http://www.baidu.com");
//        定位 搜索框
        WebElement element = driver.findElement(By.id("kw"));
//        输入文本值
        element.sendKeys("webdriver");
        Thread.sleep(2000);
//          清空文本框
        element.clear();
    }

    /**
     * 1. 打开百度首页
     * 2. 获取 右上角文本
     * 3. 控制台输入
     */
    @Test
    public void getText() {
//        打开百度首页
        driver.get("http://www.baidu.com");
//        定位元素
        List<WebElement> webElements = driver.findElements(By.xpath(".//*[@id='u1']/a"));

        for (int i = 0; i < webElements.size(); i++) {
            String text = webElements.get(i).getText();
            System.out.println(text);
        }
    }

    @Test
    public void tagNameTest() {
//        打开百度页面
        driver.get("http://www.baidu.com");
        WebElement element = driver.findElement(By.id("kw"));
//        获取tagName
        String tagName = element.getTagName();
        System.out.println(tagName);
        Assert.assertEquals(tagName, "input");
    }


    @Test
    public void getA() {
//      打开百度
        driver.get("http://www.baidu.com");
//        定位元素
        WebElement element = driver.findElement(By.id("kw"));
//        获取元素的某个属性值
        String att = element.getAttribute("maxlength");
        Assert.assertEquals(att, "255");
    }

    @Test
    public void isDis() {
//        打开百度首页
        driver.get("http://www.baidu.com");
//        定位元素并判断是否在页面上显示
        boolean b = driver.findElement(By.id("su")).isDisplayed();
        Assert.assertTrue(b);
    }

    @Test
    public void isSelect() {
//        打开 UI测试界面
        driver.get("file:///G:/selenium%20%E8%AF%BE%E7%A8%8B/selenium_html/index.html");
//       获取 是否 单选框是否被选中
        WebElement element = driver.findElement(By.xpath("//*[@id=\"radio\"]/input[1]"));
//        点击点选按钮
        element.click();
//        判断是否被选中
        boolean b = element.isSelected();
        System.out.println(b);
//        校验
        Assert.assertFalse(b);
    }

    @Test
    public void isEnabledTest() {
//        打开 测试页面
        driver.get("file:///G:/selenium%20%E8%AF%BE%E7%A8%8B/selenium_html/index.html");
//       判断是否激活
        boolean b = driver.findElement(By.id("id01")).isEnabled();
        System.out.println(b);
//        校验
        Assert.assertFalse(b);
    }

    @Test
    public void screenShotTest() {
//        打开百度页面
        driver.get("http://www.baidu.com");
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File(".//logs//screenShots//test1.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @AfterMethod
    public void closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
