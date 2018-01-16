package com.mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by niranjan on 1/16/18.
 */
public class SimpleTest {

    @Test
    public void myTest()
    {
        System.out.println("My first test using testNG !!");
    }

    @Test
    public void negativeTest()
    {
        Assert.fail("Failing test case !!");
       // Assert.assertTrue(true,"Passing the test");
    }
}
