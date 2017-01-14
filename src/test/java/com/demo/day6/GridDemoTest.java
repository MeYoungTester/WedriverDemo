package com.demo.day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrator on 2017/1/7.
 */
public class GridDemoTest {

    @Test
    public void testGrid() throws InterruptedException, MalformedURLException {
//         创建一个 DesiredCapabilities 类型
        DesiredCapabilities dc = DesiredCapabilities.chrome();
//        实例化一个driver
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.111:4444/wd/hub"),dc);

        driver.get("http://www.baidu.com");
        Thread.sleep(10000);
        driver.quit();
    }



    @DataProvider(name = "data4")
    public Object[][] test1() {
        return new Object[][]{
                {"firefox","1","2"},
                {"chrome","3","4"}};
    }

    @Test(dataProvider = "data4")
    public void testGrid2(String browser) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = null;
        if (browser == "firefox") {
            dc = DesiredCapabilities.firefox();
        } else if (browser == "chrome") {
            dc = DesiredCapabilities.chrome();
        } else {
            System.out.println("error");
        }
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.111:5555/wd/hub"), dc);

        driver.get("http://www.baidu.com");
        Thread.sleep(3000);
        driver.quit();

    }
}
