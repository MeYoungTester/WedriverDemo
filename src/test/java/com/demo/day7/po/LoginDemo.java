package com.demo.day7.po;

import com.demo.day7.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Administrator on 2017/1/7.
 */
public class LoginDemo {

    public static void loign(WebDriver driver, String email, String pwd) {
        WebElement frame = driver.findElement(LoginPage.iframe1);
        driver.switchTo().frame(frame);
        driver.findElement(LoginPage.emailTextFeild).sendKeys(email);
        driver.findElement(LoginPage.pwdTextFeild).sendKeys(pwd);
        driver.findElement(LoginPage.loginButton).click();
        driver.findElement(LoginPage.saveCheckbox).click();
//        输入验证码
//        driver.findElement(...)
    }
}
