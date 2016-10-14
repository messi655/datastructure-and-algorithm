package com.algorithm;

import java.util.Arrays;

/**
 * Created by tinhv on 27/09/2016.
 */
public class InsertSort {

    public static void insertSortAlgorithm(int[] arr){
        int holePosition;
        int valueToInsert;
        int shift = 0;

        for(int i = 1; i < arr.length; i++){
            valueToInsert = arr[i];
            holePosition = i;

            while((holePosition > 0) && (arr[holePosition - 1] > valueToInsert) ){
                shift += 1;
                arr[holePosition] = arr[holePosition - 1];
                for(int j = 0; j < arr.length; j++){
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
                holePosition = holePosition - 1;
            }
            arr[holePosition] = valueToInsert;
        }
        System.out.println(shift);
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,1,2};
        insertSortAlgorithm(arr);

        System.out.println(Arrays.toString(arr));
    }
}
