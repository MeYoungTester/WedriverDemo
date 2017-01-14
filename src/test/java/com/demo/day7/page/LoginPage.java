package com.demo.day7.page;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2017/1/14.
 */
public class LoginPage {
//    iframe 元素
    public  static By iframe1 = By.id("x-URS-iframe1");

//    email 文本框定位方式
    public static By emailTextFeild = By.name("email1");

//    pwd 定位方式
    public static By pwdTextFeild = By.name("password");

//    登录按钮 定位方式
    public  static By loginButton =  By.id("dologin");

    public static By saveCheckbox = By.id("un-login");
}
