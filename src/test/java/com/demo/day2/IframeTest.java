package com.demo.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2016/12/15.
 */
public class IframeTest {

    WebDriver driver;

    @BeforeMethod
    public void openChrome() {
        System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testIframe(){
        driver.get("file:///C:/selenium_html/index.html");

        WebElement element = driver.findElement(By.xpath("/html/body/div/table/tbody/tr[15]/td[2]/iframe"));

//        driver 控制权转交给iframe
        driver.switchTo().frame(element);

        driver.findElement(By.linkText("baidu")).click();
//         driver 控制权转交给默认页面
        driver.switchTo().defaultContent();

        driver.findElement(By.linkText("登陆界面")).click();
    }

    @AfterMethod
    public void closed(){
        driver.quit();
    }

}
