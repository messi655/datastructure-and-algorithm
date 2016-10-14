package com.algorithm;

import java.util.Scanner;

/**
 * Created by tinhv on 22/09/2016.
 */
public class VeryBigSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        long result = 0;
        //int a = 0;

        for(int i = 0; i < arr.length; i++){
            result += arr[i];
        }
        System.out.println(result);
    }
}
