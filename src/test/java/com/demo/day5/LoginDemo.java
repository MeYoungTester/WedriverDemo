package com.demo.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Administrator on 2017/1/7.
 */
public class LoginDemo {

    public static void loign(WebDriver driver, String email, String pwd) {
        driver.switchTo().frame("x-URS-iframe");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(pwd);
        driver.findElement(By.id("dologin")).click();
    }
}
