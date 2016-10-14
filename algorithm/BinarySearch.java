package com.algorithm;

/**
 * Created by tinhv on 13/10/2016.
 */
public class BinarySearch {

    public int[] sort(int[] arr) {
        if (arr.length > 1) {
            int[] left = leftHafl(arr);
            int[] right = rightHafl(arr);

            sort(left);
            sort(right);

            copyToArray(arr, left, right);
        }
        return arr;


    }

    private void copyToArray(int[] arr, int[] left, int[] right) {
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

    private int[] leftHafl(int[] arr) {
        int leftsize = arr.length / 2;
        int[] leftArray = new int[leftsize];
        for (int i = 0; i < leftsize; i++) {
            leftArray[i] = arr[i];
        }
        return leftArray;
    }

    private int[] rightHafl(int[] arr) {
        int leftsize = arr.length / 2;
        int rightsize = arr.length - leftsize;
        int[] rightArray = new int[rightsize];
        for (int i = 0; i < rightsize ; i++){
            rightArray[i] = arr[leftsize + i];
        }
        return rightArray;
    }

    public void search(int[] arr, int x){

        int[] newarr = sort(arr);
        int start = 1;
        int end = arr.length;

        while(true){
            if(start > end){
                System.out.println(x + " does not exist in this arr");
                break;
            }
            else {

                int midpoint = start + (end - start) / 2;

                if (newarr[midpoint] < x) {
                    start = midpoint + 1;
                }
                if (newarr[midpoint] > x) {
                    end = midpoint - 1;
                }
                if (newarr[midpoint] == x) {
                    System.out.println(x + " found in array at " + midpoint);
                    break;
                }
                else{
                    System.out.println(x + " does not exist in this arr");
                    break;
                }
            }
        }
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1,4,3,10,0};
        BinarySearch bi = new BinarySearch();
        //bi.sort(arr);
        //printArray(arr);
        bi.search(arr,12);
    }


}
