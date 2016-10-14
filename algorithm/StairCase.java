package com.algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by tinhv on 22/09/2016.
 */
public class StairCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();



//        String str = "";
//        for(int i = 0; i < n; i++){
//            str +="#";
//            System.out.format("%"+n+"s%n",str);
//        }


        int arr[][] = new int[n][n];

        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < arr.length ; j++){
                if((i+j) < (arr.length - 1)){
                    System.out.print(" ");
                }
                if((i+j) >= (arr.length - 1)){
                    System.out.print("#");
                }
            }
            System.out.println();
        }

    }
}
