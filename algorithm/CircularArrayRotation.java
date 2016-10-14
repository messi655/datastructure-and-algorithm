package com.algorithm;

import java.util.Scanner;

/**
 * Created by tinhv on 23/09/2016.
 */
public class CircularArrayRotation {


    /**
     *
     * @param arr
     * @param k
     * O(kxN)
     */
    public void roration(int[] arr, int k){
        for(int i = 0; i < k; i++){
            int temp = arr[arr.length - 1];
            for(int j = (arr.length - 1); j > 0; j--){
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }

    }



    public static void main(String[] args) {

        CircularArrayRotation cir = new CircularArrayRotation();

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int q = scan.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        cir.roration(arr,k);


        for(int i = 0; i < q; i++){
            int index = scan.nextInt();
            System.out.println(arr[index]);
        }

    }
}
