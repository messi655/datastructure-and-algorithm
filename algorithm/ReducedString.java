package com.algorithm;

import java.util.Scanner;

/**
 * Created by tinhv on 26/09/2016.
 */
public class ReducedString {
    public static void main(String[] args) {
        String str = "baab";

//        Scanner scan = new Scanner(System.in);
//        String str = scan.next();
//
//        for(int i = 1; i < str.length(); i++){
//            System.out.println("============= after for: " + i);
//            if(str.charAt(i) == str.charAt(i-1)){
//                str = str.substring(0,i - 1) + str.substring((i+1));
//                System.out.println("=============: " + i);
//                i = 0;
//            }
//            if(str.length() == 0){
//                System.out.println("Empty String");
//            }
//            else{
//                System.out.println(str);
//            }
//            System.out.println("out of loop: " + i);
//        }

        System.out.println(str.substring(2));
//        System.out.println(str.substring(0,0) + str.substring(2));
//        System.out.println(str.substring(0,0));

    }
}
