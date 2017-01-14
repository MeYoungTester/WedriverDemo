package com.demo.day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/1/7.
 */
public class PhantomJSTest {
    @Test
    public void testPh() throws InterruptedException {
        System.setProperty("phantomjs.binary.path",".\\drivers\\phantomjs.exe");
        WebDriver driver = new PhantomJSDriver();

        Thread.sleep(5000);
        driver.get("http://www.baidu.com");
        System.out.println(driver.getTitle());

        driver.quit();

    }
}
