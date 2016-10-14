package com.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tinhv on 07/10/2016.
 */
public class MaximumSubArray {

    public  int[] compareSub(int arr[]){
        int start=-1;
        int end=-1;
        int max=0;
        if(arr.length>0){

            start=0;end=0;max=arr[0];
            for(int arrSize=1;arrSize<arr.length;arrSize++){
                for(int i=0;i<arr.length-arrSize+1;i++){
                    int potentialMax=sumOfSub(arr,i,i+arrSize)%7;
                    if(potentialMax>max){
                        max=potentialMax;
                        start=i;
                        end=i+arrSize-1;
                    }
                }
            }

        }
        return new int[]{start,end,max};
    }

    public static int sumOfSub(int arr[],int start,int end){
        int sum=0;
        for(int i=start;i<end;i++)
            sum+=arr[i];
        return sum;
    }

    public int maxSubArray(int[] A) {
        int max = A[0];
        int[] sum = new int[A.length];
        sum[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            sum[i] = (Math.max(A[i], sum[i - 1] + A[i]))%7;
            max = Math.max(max, sum[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        MaximumSubArray max = new MaximumSubArray();

        for(int i = 0; i < q; i++){

            int m = scanner.nextInt();
            int[] arr = new int[m];
            for(int j = 0; j < m; j++){
                arr[j] = scanner.nextInt();
            }
            System.out.println(max.maxSubArray(arr));

        }
    }
}
