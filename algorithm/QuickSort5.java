package com.algorithm;

/**
 * Created by tinhv on 03/10/2016.
 */
public class QuickSort5 {
    public static void quicSort(int[] arr){
        subQuickSort(arr, 0, arr.length - 1);
    }

    private static void subQuickSort(int[] arr, int start, int end) {
        int i = start;
        int k = end;

        if(end - start >= 1){
            int pivot = arr[start];

            while(k > i){
                while(arr[i] <= pivot && i <= end && k > i){
                    i++;
                }
                while(arr[k] > pivot && k >= start && k >= i){
                    k--;
                }
                if(k > i){
                    swap(arr, i, k);
                }
            }
            swap(arr,start, k);
            
            subQuickSort(arr, start, k - 1);
            subQuickSort(arr, k + 1, end);
        }
        else{
            return;
        }

    }

    private static void swap(int[] arr, int start, int k) {
       int temp = arr[start];
        arr[start] = arr[k];
        arr[k] = temp;
    }

    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] xxx = {90, 50, 100, 222, 44, 10};
        quicSort(xxx);
        printArr(xxx);
    }
}
