package com.datastructure;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by tinhv on 28/07/2016.
 */
public class ArraysDS {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int n = in.nextInt();
            int arr[] = new int[n];
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }

            for(int j = (arr.length - 1); j >=0 ; j--){
                System.out.print(arr[j] + " ");
            }


        }
    }
