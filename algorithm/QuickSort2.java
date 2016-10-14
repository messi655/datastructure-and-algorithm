package com.algorithm;

import java.util.Arrays;

/**
 * Created by tinhv on 27/09/2016.
 */
public class QuickSort2 {
    public int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int index = left - 1;

        for(int j = left; j <= right - 1; j++){
            if(arr[j] > pivot){
                index++;
                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[index + 1];
        arr[index + 1] = arr[right];
        arr[right] = temp;

        return index + 1;
    }

    public void quickSort(int[] arr, int indexleft, int indexright){
        if(indexleft < indexright){

            int index = new QuickSort2().partition(arr, indexleft, indexright);

            quickSort(arr,indexleft, index - 1);

            quickSort(arr, index + 1, indexright);

        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {

            int arr[] = {5,8,1,3,7,9,2};
            //int n = arr.length;

            QuickSort2 ob = new QuickSort2();
//            ob.quickSort(arr, 0, arr.length - 1);
//
//            System.out.println("sorted array");
//            printArray(arr);

        System.out.println(ob.partition(arr,0,arr.length-1));
        printArray(arr);

    }
}
