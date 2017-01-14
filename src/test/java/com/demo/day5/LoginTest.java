package com.demo.day5;

import com.sun.xml.internal.ws.api.server.AbstractServerAsyncTransport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2016/12/29.
 */
public class LoginTest {
/*


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


    LoginTest loginTest = new LoginTest();

    */
/**
     * 成功登录的case
     *//*

    @Test
    public void loginSucess() {
        driver.get("http://mail.163.com");
//      driver 控制权转交
        driver.switchTo().frame("x-URS-iframe");

        driver.findElement(By.name("email")).sendKeys("meyoungtester");
        driver.findElement(By.name("password")).sendKeys("meyoung123");

// 点击登录
        driver.findElement(By.id("dologin")).click();
//        loginTest.wait(By.linkText("退出"));
//      判断 退出 文本是否存在
        boolean b = driver.findElement(By.linkText("退出")).isDisplayed();
        Assert.assertTrue(b);
//      校验 登录的用户名是否为xxx
        String name = driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/div/div[2]/div[2]/span[1]/span[1]")).getText();
        Assert.assertEquals(name, "meyoungtester");
    }



    */
/**
     * 密码错误登录的case
     *//*

    @Test
    public void loginFail() {
        driver.get("http://mail.163.com");
        LoginDemo.loign(driver,"meyoungtester","12312312");

        String msg = driver.findElement(By.xpath("./*/
/*[@id='nerror']/div[2]")).getText();
        Assert.assertEquals(msg, "帐号或密码错误");
    }

    */
/**
     * 账号错误登录的case
     *//*

    @Test
    public void loginFail2() {
        driver.get("http://mail.163.com");
        LoginDemo.loign(driver,"123123123","meyoung123");
        String msg = driver.findElement(By.xpath("./*/
/*[@id='nerror']/div[2]")).getText();
        Assert.assertEquals(msg, "账号不存在");
    }

    public void wait(By by){
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(by));
    }



*/

}
