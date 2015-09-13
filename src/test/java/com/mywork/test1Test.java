package com.mywork;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by ksharma on 6/4/15.
 */
public class test1Test {

    @BeforeMethod
    public void setUp() throws Exception {

    }

    test1 test = new test1();

    public void printSumTest(){
        //test.printSum();
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }
}