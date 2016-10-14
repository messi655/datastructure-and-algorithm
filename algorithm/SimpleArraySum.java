package com.algorithm;

import java.util.Scanner;

/**
 * Created by tinhv on 20/09/2016.
 */
public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        int sum = 0;

        for (int j = 0; j < arr.length; j++){
            sum = sum + arr[j];
        }

        System.out.println(sum);
    }
}
