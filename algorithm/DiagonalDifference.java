package com.algorithm;

import java.util.Scanner;

/**
 * Created by tinhv on 22/09/2016.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int primary_diagonal = 0;
        int second_diagonal = 0;

        for(int i = 0; i< a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(i == j){
                    primary_diagonal += a[i][j];
                }
                if((i+j) == (a.length - 1)){
                    second_diagonal += a[i][j];
                }
            }
        }
        //System.out.println("pri " + primary_diagonal);
        //System.out.println("second " + second_diagonal);
        int result = primary_diagonal - second_diagonal;
        System.out.println(Math.abs(result));
    }
}
