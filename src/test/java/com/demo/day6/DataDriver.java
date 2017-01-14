package com.demo.day6;

import com.demo.day5.LoginDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/1/7.
 */
public class DataDriver {

    @DataProvider(name = "data1")
    public Object[][] testDataDriver() {
        return new Object[][]{{"Y", "Y"}, {"Y", "N"}, {"N", "N"}};
    }

    @Test(dataProvider = "data1")
    public void testData(String userName, String pwd) {
        System.out.println(userName);
        System.out.println(pwd);
        System.out.println(pwd);
    }


    @DataProvider(name = "data2")
    public Object[][] testDataDriver2() {
        return new Object[][]{{"meyoungtester", "meyoung123"}, {"meyoungtester", "fasdfasdf"}, {"asd", "asdasd"}};
    }

    @Test(dataProvider = "data2")
    public void testLogin(String userName, String pwd) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://mail.163.com");
        LoginDemo.loign(driver,userName,pwd);
        Thread.sleep(5000);
        driver.quit();
    }
}
