package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {

    @Test
    public void test1(){

        System.out.println("First");
        Assert.assertEquals("title","title");

        System.out.println("Second");
        Assert.assertEquals("URL","URL");

    }
    @Test
    public void Test2(){

        System.out.println("Test2");
    }
    @AfterMethod
    public void tearDown(){

        System.out.println("Close Browser");
    }
}
