package com.demo.day3;

import com.demo.day2.WindowTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

/**
 * Created by Administrator on 2016/12/27.
 */
public class ActionsTest {

    WebDriver driver;

    @BeforeMethod
    public void openChrome() {
        System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
        driver = new ChromeDriver();
    }

    /**
     * 1.我打开百度
     * 2.百度一下按钮 右键
     */
    @Test
    public void testContextClick() throws InterruptedException {
        driver.get("http://www.baidu.com");
//      定位百度一下按钮
        WebElement baiduButton = driver.findElement(By.id("su"));
//      实例化 Actions 类
        Actions actions = new Actions(driver);
//      模拟在百度一下按钮上右键
        actions.contextClick(baiduButton).perform();
        Thread.sleep(5000);
//      模拟双击效果
        actions.doubleClick(baiduButton).perform();

//        actions.doubleClick().perform();
//        actions.contextClick().perform();
    }

    @Test
    public void moveToElement(){
        driver.get("http://www.baidu.com");
//        定位更多产品 按钮
        WebElement element = driver.findElement(By.name("tj_briicon"));
//          实例化 Actions
        Actions actions = new Actions(driver);
//        模拟鼠标移动到某个元素上
        actions.moveToElement(element).perform();
    }

    @Test
    public void moveElement(){
        driver.get("file:///C:/selenium_html/dragAndDrop.html");
//      定位到要拖动的元素
        WebElement element = driver.findElement(By.id("drag"));
//      实例化 Actions
        Actions actions = new Actions(driver);
//      拖动 元素到 x y 位置
        actions.dragAndDropBy(element,300,400).perform();

    }

    @Test
    public void elementMoToOtherElement(){
        driver.get("file:///C:/selenium_html/dragAndDrop.html");

        WebElement element1 = driver.findElement(By.id("drag"));
        WebElement element2 = driver.findElement(By.xpath("html/body/h1"));

        Actions actions = new Actions(driver);
//      模拟拖动某个元素到另一个元素上
        actions.clickAndHold(element1)
                .moveToElement(element2)
                .release(element1)
                .perform();
    }

    @Test
    public void test05(){
        driver.get("file:///C:/selenium_html/index.html");

        WebElement element = driver.findElement(By.id("selectWithMultipleEqualsMultiple"));

        Actions actions = new Actions(driver);

        List<WebElement> list = element.findElements(By.tagName("option"));

//        模拟按下 并点击选取
        actions.keyDown(Keys.SHIFT).keyDown(Keys.CONTROL)
                .click(list.get(0))
                .click(list.get(2))
                .perform();

    }

    @Test
    public void robotTest() throws AWTException {
        driver.get("http://www.baidu.com");

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);


        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);

        int s = (int)new Character('S');

        robot.keyPress(s);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_F);

        robot.keyRelease(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_CONTROL);

    }

    @Test
    public void testUPload(){
        driver.get("file:///C:/selenium_html/index.html");
        driver.findElement(By.id("load")).sendKeys("C:\\install.log");
    }

    @AfterMethod
    public void closed() throws InterruptedException {

        Thread.sleep(5000);
//        driver.quit();
    }

}
