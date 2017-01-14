package com.demo.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2016/12/10.
 */
public class AssertTest {

    @Test
    public void testEquals() {
        String a = "1234";
        String b = "1234";
        Assert.assertEquals(a, b);
    }

    @Test
    public void testNoEquals(){
        int a = 1;
        int b = 1;
        Assert.assertNotEquals(a,b,"a等于b");
    }

    @Test
    public void assertNoNull(){
        String a = null;
        Assert.assertNotNull(a,"a为空");
    }

    @Test
    public void assertNull(){
        String a = "fasf";
        String b = "fasf";
        String n = "fasf";
        Boolean t = true;
        Assert.assertNull(a,"a为空");

        Assert.assertTrue(t);

    }

}
