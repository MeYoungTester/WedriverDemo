package com.demo.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2016/12/10.
 */
public class OpenBrowser {


    WebDriver driver;
    @Test
    public void openFirefox(){
//        启动火狐
        driver = new FirefoxDriver();

    }

    @Test
    public void openFirefox2(){
//        设置火狐的安装路径
        System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//        启动火狐浏览器
        driver = new FirefoxDriver();
    }

    @Test
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void openIE(){
        System.setProperty("webdriver.ie.driver",".\\drivers\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
    }

    @Test
    public void openEdge(){
        System.setProperty("webdriver.edge.driver",".\\drivers\\MicrosoftWebDriver.exe");
        driver = new EdgeDriver();

    }

    @AfterMethod
    public void closed() throws InterruptedException {

        Thread.sleep(5000);
//      关闭
//        driver.close();
        driver.quit();
    }
}
