package com.demo.day5;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2016/12/29.
 */
public class CreateUsersTest extends BaseCase {
/*
    long time = System.currentTimeMillis();

*//*    @Test
    public void test1(){
        System.out.println(time);
    }*//*

    *//**
     * 手机验证码错误的case
     *//*
    @Test
    public void createEmail() throws InterruptedException {
//        打开测试地址
        driver.get("http://mail.163.com/");
//         控制权转交给 iframe
        driver.switchTo().frame("x-URS-iframe");
//          点击去注册
        driver.findElement(By.id("changepage")).click();
//          控制权转交给新页面
        String handle1 = driver.getWindowHandle();

        for (String handles : driver.getWindowHandles()) {
            if (handles.equals(handle1)) {
                continue;
            }
            driver.switchTo().window(handles);
        }
//        填写注册表单
        driver.findElement(By.xpath("./*//*[@id='tabsUl']/li[1]/a")).click();
        driver.findElement(By.id("nameIpt")).sendKeys("E" + String.valueOf(time));
        driver.findElement(By.id("mainPwdIpt")).sendKeys("password");
        driver.findElement(By.id("mainCfmPwdIpt")).sendKeys("password");

        driver.findElement(By.id("mainMobileIpt")).sendKeys(String.valueOf(time / 100));
        driver.findElement(By.id("vcodeIpt")).sendKeys("error");
        driver.findElement(By.id("mainAcodeIpt")).sendKeys("123123");
        driver.findElement(By.id("mainRegA")).click();

        Thread.sleep(2000);
//        校验 是否有提示手机验证码错误
        String err1 = driver.findElement(By.xpath("./*//*[@id='m_mainAcode']/span")).getText().trim();
        Assert.assertEquals(err1, "手机验证码不正确，请重新填写");

    }*/
}
