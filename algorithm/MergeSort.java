package com.algorithm;

/**
 * Created by tinhv on 03/10/2016.
 */
public class MergeSort {

    public static void mergeSort(int[] arr){
        if(arr.length > 1){
            int [] left = leftHalf(arr);
            int [] right = rightHalf(arr);
            
            mergeSort(left);
            mergeSort(right);
            
            mergerCopy(arr,left,right);


        }
    }

       private static void mergerCopy(int[] arr, int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;

        for(int i = 0; i < arr.length; i++){
            if((rightIndex >= right.length) || (leftIndex < left.length && left[leftIndex] < right[rightIndex])){
                arr[i] = left[leftIndex];
                leftIndex++;
            }
            else{
                arr[i] = right[rightIndex];
                rightIndex++;
            }
        }
    }

    private static int[] rightHalf(int[] arr) {
        int sizeLeft = arr.length/2;
        int[] left = new int[sizeLeft];

        for(int i = 0; i < sizeLeft; i++){
            left[i] = arr[i];
        }
        return left;
    }

    private static int[] leftHalf(int[] arr) {
        int sizeleft = arr.length/2;
        int sizeright = arr.length - sizeleft;

        int[] right = new int[sizeright];

        for(int i = 0; i < sizeright; i++){
            right[i] = arr[sizeleft + i];
        }
        return right;
    }

    private static void printArr(int[] arr) {

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {90, 70, 100, 50, 60, 99};
        mergeSort(arr);
        printArr(arr);
    }
}
