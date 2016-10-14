package com.algorithm;

import java.util.Scanner;

/**
 * Created by tinhv on 27/09/2016.
 */
public class SortRunTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int j = 0; j < n; j++){
            arr[j] = scanner.nextInt();
        }

        int shift = 0;
        int valueInsert;
        int position;


        for(int i = 1; i < arr.length; i++){
            valueInsert = arr[i];
            position = i;

            while((position > 0) && (arr[position - 1] > valueInsert)){
                shift += 1;
                arr[position] = arr[position - 1];
                position = position - 1;
            }
            arr[position] = valueInsert;
        }
        System.out.println(shift);
    }
}
