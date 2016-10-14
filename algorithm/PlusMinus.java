package com.algorithm;

import java.util.Scanner;

/**
 * Created by tinhv on 22/09/2016.
 */
public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                positive += 1;
            }
            if(arr[i] == 0){
                zero += 1;
            }
            if(arr[i] < 0){
                negative += 1;
            }
        }
        System.out.println((double)positive/n);
        System.out.println((double)negative/n);
        System.out.println((double)zero/n);
    }
}
