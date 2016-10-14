package com.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tinhv on 05/10/2016.
 */
public class Test3 {


    public static void main(String[] args) {
        try {
            int x = 300;
            int y = 100;
            if (x == y) {
                System.out.println("balalaal");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is executed");
        }

        List<Long> list = new ArrayList<Long>();
        long a = 22222;

        list.add((long)1111);
        list.add((long) 22222);

        System.out.println(list.contains(a));


    }
}

