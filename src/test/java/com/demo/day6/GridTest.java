package com.demo.day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrator on 2017/1/7.
 */
public class GridTest {
    @Test
    public void testGrid() throws MalformedURLException, InterruptedException {

        DesiredCapabilities chromeDC = DesiredCapabilities.chrome();
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.111:5555/wd/hub"),chromeDC);
        System.out.println("-----------");
        driver.get("http://www.baidu.com");
        Thread.sleep(10000);
        driver.quit();
    }
}
