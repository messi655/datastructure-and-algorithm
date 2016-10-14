package com.algorithm;

import java.util.Scanner;

/**
 * Created by tinhv on 04/10/2016.
 */
public class SharlockArraySum {



    public void checkIfLeftEqualToRight(int[] integers) {
        int totalIntArrayToLoop = integers.length - 1;
        int sum = getTotalSum(integers, 0, totalIntArrayToLoop);

        for (int i = 0; i <= totalIntArrayToLoop; i++) {
            if (i == 0 || i == totalIntArrayToLoop) {
                int remained = sum - integers[i];

                if (remained == 0) {
                    System.out.println("Index: " + i + " : "  +"Value: " + integers[i]);
                    System.out.println("YES");
                    return;
                }
            } else {
                int toSubtract = getTotalSum(integers, 0, i - 1);
                int resultToCheck = sum - (toSubtract * 2) - integers[i];

                if (resultToCheck == 0) {
                    System.out.println("Index: " + i + " : "  +"Value: " + integers[i]);
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
        return;
    }

    public int getTotalSum(int[] num, int start, int stop) {

        int returnSum = 0;
        for (int i = start; i <= stop; i++) {
            returnSum = returnSum + num[i];
        }

        return returnSum;
    }

    public void numberBalance(int[] arr){
        int left = arr.length/2;
        System.out.println("start left: " + left);
        System.out.println("left index: " + arr[left]);

        int leftsum = 0;
        int rightsum = 0;

        for(int i = 0; i < left; i++){
            leftsum = leftsum + arr[i];
        }

        for(int j = left + 1; j < arr.length; j++){
            rightsum = rightsum + arr[j];
        }


        if(rightsum == leftsum){
            //System.out.println("value: " + arr[left] + " " + "Index: " + left);
            System.out.println("YES");
        }
        else{
            while(true){
                if(leftsum < rightsum){
                    left= left + 1;
                    leftsum = leftsum + arr[left];
                    rightsum = rightsum - arr[left - 1];
                    if(leftsum > rightsum){
                        System.out.println("NO" + " " + " step 1");
                        break;
                    }
                    if(leftsum == rightsum){
                        System.out.println("YES");
                        System.out.println("value: " + arr[left+1] + " " + "Index: " + (left+1));
                        break;
                    }
                }
                if(leftsum > rightsum){
                    left = left - 1;
                    leftsum = leftsum - arr[left];
                    System.out.println("step 2, leftsum: " + leftsum);
                    rightsum = rightsum + arr[left+1];
                    System.out.println("step 2, rightsum: " + rightsum);
                    if(leftsum < rightsum){
                        System.out.println("NO" + " " + " step 2");
                        break;
                    }
                    if(leftsum == rightsum){
                        System.out.println("YES");
                        System.out.println("value: " + arr[left-1] + " " + "Index: " + (left - 1));
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//
//        for(int i = 0; i < t; i++){
//            int a = in.nextInt();
//            int[] arr = new int[a];
//            for(int j = 0; j < a; j++){
//                arr[j] = in.nextInt();
//            }
        //int[] arr = {102, 1, 100, 1, 1};
        int[] arr = {5,6,7,8,9,10,34,1};
        //int[] arr = {1,2,3,3};
        //checkIfLeftEqualToRight(arr);
        SharlockArraySum ss = new SharlockArraySum();
                ss.numberBalance(arr);
        //}
    }

}
