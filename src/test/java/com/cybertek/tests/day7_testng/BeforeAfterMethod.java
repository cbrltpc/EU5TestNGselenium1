package com.cybertek.tests.day7_testng;

import org.testng.annotations.*;

import java.sql.SQLOutput;

public class BeforeAfterMethod {

    @Test
    public void test1() {

        System.out.println("First Test Case");
    }

    @Test
    public void test2() {

        System.out.println("Second Test Case");
    }

    @Ignore
    @Test
    public void test3() {

        System.out.println("Third Test Case");
    }

    @BeforeMethod
    public void setUp() {

        System.out.println("Opening Browser");
    }

    @AfterMethod
    public void tearDown() {

        System.out.println("Closing Browser");

    }

    @BeforeClass
    public void setUpClass() {

        System.out.println("Opening CLASS");
    }

    @AfterClass
    public void tearDownClass() {

        System.out.println("Closing CLASS");
    }
}
