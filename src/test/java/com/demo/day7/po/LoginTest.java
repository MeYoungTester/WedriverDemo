package com.demo.day7.po;

import com.demo.day7.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.rmi.runtime.Log;

/**
 * Created by Administrator on 2016/12/29.
 */
public class LoginTest {


    WebDriver driver;

    @BeforeMethod
    public void openChrome() {
        System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void closed() throws InterruptedException {

        Thread.sleep(5000);
//        driver.quit();
    }

    /**
     * 成功登录的case
     *
     * 1. 我在登录页面输入正确的账号密码（）（）
     * 2. 那么我登录成功
     */
    @Test
    public void loginSucess() {
        driver.get("http://mail.163.com");

        LoginDemo.loign(driver, "asdf@ye.com", "fsafasf");
//        loginTest.wait(By.linkText("退出"));
//      判断 退出 文本是否存在
        boolean b = driver.findElement(By.linkText("退出")).isDisplayed();
        Assert.assertTrue(b);
//      校验 登录的用户名是否为xxx
        String name = driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/div/div[2]/div[2]/span[1]/span[1]")).getText();
        Assert.assertEquals(name, "meyoungtester");
    }


}
