package com.algorithm;

import java.util.Scanner;

/**
 * Created by tinhv on 06/10/2016.
 */
public class IcecreamParlor {
    public void findCreamID(int money, int[] arr){


        for(int i = 0; i < arr.length; i++){
            int subPrice = money - arr[i];

            for(int j = i + 1; j < arr.length; j++){
                if(subPrice == arr[j] && i != j){
                    System.out.print((i + 1) + " " + (j + 1));
                    System.out.println();
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int parlor = scan.nextInt();
        for(int i = 0; i < parlor; i++){
            int m = scan.nextInt();
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++){
                arr[j] = scan.nextInt();
            }

            IcecreamParlor ip = new IcecreamParlor();
            ip.findCreamID(m,arr);
        }
    }
}
