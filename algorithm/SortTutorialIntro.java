package com.algorithm;

import java.util.Scanner;

/**
 * Created by tinhv on 27/09/2016.
 */
public class SortTutorialIntro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        for(int j = 0; j < arr.length; j++){
            if(arr[j] == v){
                System.out.println(j);
            }
        }
    }
}
