package com.datastructure;

import java.util.Scanner;

/**
 * Created by tinhv on 28/07/2016.
 */
public class Arrays2D {


    public static void main(String[] args) {
        //int[][] arr2d = new int[6][6];
        int[][] arr2d = {{1, 2, 3, 4, 5, 6},{0, 3, 1, 2, 0, 0}, {2, 0, 1, 2, 2, 3}, {0, 0, 1, 1, 1, 2}, {0, 0, 0, 0, 0, 0}, {2, 5, 1, 0, 1, 0}};
        int rows = arr2d.length;
        int columns = arr2d[0].length;
        int temp,sum = 0;


        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(i + 2 < 6 & j + 2 < 6){
                    System.out.println(arr2d[i][j] + " " + arr2d[i][j+1] + " " + arr2d[i][j+2]);
                    System.out.println(arr2d[i+1][j+1]);
                    System.out.println(arr2d[i+2][j] + " " + arr2d[i+2][j+1] + " " + arr2d[i+2][j+2]);
                    System.out.println("===============================================");
                    temp = arr2d[i][j] + arr2d[i][j+1] + arr2d[i][j+2] + arr2d[i+1][j+1] + arr2d[i+2][j] + arr2d[i+2][j+1] + arr2d[i+2][j+2];
                    if(temp >= sum){
                        sum = temp;
                    }
                }
            }
        }
        System.out.println("Sum: " + sum);

    }
}
