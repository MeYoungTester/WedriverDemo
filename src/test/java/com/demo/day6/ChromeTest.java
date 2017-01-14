package com.demo.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/1/7.
 */
public class ChromeTest {

    @Test
    public void test1(){
        String downloadFilepath = "D:\\";
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadFilepath);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);

        System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://rj.baidu.com/soft/detail/13478.html?ald");
        driver.findElement(By.className("normal_download")).click();
    }

    @Test
    public void testFirefoxDown() throws InterruptedException, AWTException {
        FirefoxProfile firefoxProfile = new FirefoxProfile();
//        设置火狐的默认下载文件夹，0表示桌面  1表示我的下载  2表示自定义文件夹
        firefoxProfile.setPreference("browser.download.folderList", "2");
//        设置自定义文件夹位置
        firefoxProfile.setPreference("browser.download.dir", "D:\\soft");
//         设置无需确认下载的文件格式
        firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream, application/vnd.ms-excel, text/csv, application/zip,application/exe");
//        打开一个预先配置的火狐
        WebDriver driver = new FirefoxDriver(firefoxProfile);
        driver.get("http://rj.baidu.com/soft/detail/13478.html?ald");
        driver.findElement(By.xpath(".//*[@id='softAbs']/a[2]")).click();
//        Thread.sleep(3000);
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(1000);
//        robot.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(1000);
//        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(10000);
        driver.quit();
    }
}
