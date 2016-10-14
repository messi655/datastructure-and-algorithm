package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tinhv on 27/09/2016.
 */
public class QuickSort1 {
    public static void pivot1(int[] arr){

        List left = new ArrayList();
        List right = new ArrayList();

        int pivot = 0;

        for(int j = 1; j < arr.length; j++){
            pivot = arr[0];
            if(arr[j] > pivot){
                right.add(arr[j]);
            }
            else if(arr[j] < pivot){
                left.add(arr[j]);
            }
        }

        for(int k = 0; k < left.size(); k++){
            System.out.print(left.get(k) + " ");
        }

        System.out.print(pivot + " ");

        for(int l = 0; l < right.size(); l++){
            System.out.print(right.get(l) + " ");
        }
    }

    public static void pivot2(int[] arr){
        int pivot = arr[0];
        int temp;
        int last = arr.length - 1;
        for(int i =  arr.length - 1; i >=1; i--){

            if(arr[i] > pivot){
                temp = arr[i];
                arr[i] = arr[last];
                arr[last] = temp;
                last = last - 1;
            }
        }

        temp = arr[last];
        arr[last] = arr[0];
        arr[0] = temp;


        printArray(arr);
    }

    public static void printArray(int[] ar) {
        for(int n = 0; n < ar.length; n++){
            System.out.print(ar[n]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        pivot2(arr);
    }
}
