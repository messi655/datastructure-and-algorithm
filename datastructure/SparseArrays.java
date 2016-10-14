package com.datastructure;

import java.util.Scanner;

/**
 * Created by tinhv on 29/07/2016.
 */
public class SparseArrays {
    public static void main(String[] args) {
        int result = 0;
        Scanner in_arr = new Scanner(System.in);
        int n = in_arr.nextInt();
        String[] arr = new String[n];

        for(int k = 0; k < n; k++){
            arr[k] = in_arr.next();
        }


        int q = in_arr.nextInt();
        String[] query = new String[q];
        for(int l = 0; l < q; l++){
            query[l] = in_arr.next();
        }


        for(int i = 0; i < query.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(query[i].equalsIgnoreCase(arr[j])){
                    result = result + 1;
                }
            }
            System.out.println(result);
            result = 0;
        }

    }
}
