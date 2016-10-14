package com.algorithm;

import java.util.Scanner;

/**
 * Created by tinhv on 26/09/2016.
 */
public class CamelCase {
    private String x;

    public CamelCase(String x){
        this.x = x;
    }

    public void printOut(){
        System.out.println("abc");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s =  in.next();
        int result = 0;
        for(int i = 0; i < s.length(); i++){

            if(Character.isUpperCase(s.charAt(i))){
                result += 1;
            }
        }
        System.out.println(result + 1);
    }
}
