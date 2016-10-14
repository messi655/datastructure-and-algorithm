package com.datastructure;

import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by tinhv on 14/09/2016.
 */
public class MyUnitTest {

    MyUnit myUnit = new MyUnit();

    int sum = myUnit.sum(2,5);
    int testSum = 7;
    int testSum1 = 10;

    @org.junit.Test
    public void concatenate1() throws Exception {
        System.out.println("@Test sum(): " + sum + " = " + testSum);
        assertEquals(sum,testSum);
    }

    @org.junit.Test
    public void concatenate2() throws Exception {
        System.out.println("@Test sum(): " + sum + " = " + testSum1);
        assertEquals(sum,testSum1);
    }

}