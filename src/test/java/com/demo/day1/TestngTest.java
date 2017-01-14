package com.demo.day1;


import org.testng.annotations.*;

/**
 * Created by Administrator on 2016/12/10.
 */
public class TestngTest {

    @Test
    public void btest5(){
        // add
        System.out.println("这个是@Test5");
    }

    @Test
    public void atest4(){
//        delete
        System.out.println("这个是@Test4");
    }

    @BeforeTest
    public void test2(){
        System.out.println("这是个befortest");
    }

    @BeforeMethod
    public void test3(){
        System.out.println("这是个BeforeMethod");
    }

    @AfterMethod
    public void testA1(){
        System.out.println("这是个AfterMethod");
    }


    @AfterTest
    public void testA2(){
        System.out.println("这是个AfterTest");
    }


}
