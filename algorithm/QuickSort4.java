package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by tinhv on 29/09/2016.
 */
public class QuickSort4 {

    static int partition(int ar[], int minpos, int maxpos) {
        int pivot = ar[minpos];
        ArrayList<Integer> leftlist = new ArrayList<Integer>();
        ArrayList<Integer> rightlist = new ArrayList<Integer>();

        for (int i = minpos + 1; i <= maxpos; i++) {
            if (ar[i] < pivot)
                rightlist.add(ar[i]);
            else
                leftlist.add(ar[i]);
        }
        copy(leftlist, ar, minpos);
        int index = leftlist.size() + minpos;
        ar[index] = pivot;
        copy(rightlist, ar, index + 1);

        return minpos + leftlist.size();
    }

    static void copy(ArrayList<Integer> list, int ar[], int startIdx) {
        for (int num : list) {
            ar[startIdx++] = num;
        }
    }

    static void preparequickSort(int ar[], int minpos, int maxpos) {
        if (minpos >= maxpos) {
            return;
        }

        int pos = partition(ar, minpos, maxpos);

        preparequickSort(ar, minpos, pos - 1);
        preparequickSort(ar, pos + 1, maxpos);

        printArray(ar, minpos, maxpos);
    }

    static void quickSort(int[] ar) {
        preparequickSort(ar, 0, ar.length - 1);
    }

    static void printArray(int[] ar, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println("");
    }


    public static void main(String[] args) {

        int[] ar = {99, 10, 40, 30};
        quickSort(ar);


    }


}
