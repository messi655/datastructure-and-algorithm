package com.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tinhv on 26/09/2016.
 */
public class Pangrams {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //String str = "qmExzBIJmdELxyOFWv LOCmefk TwPhargKSPEqSxzveiun";

        str = str.replaceAll(" ","");

        System.out.println("List after clean space: " + str);
        List<Character> arr = new ArrayList<Character>();


        for(int i = 0; i < str.length(); i++){
            if(arr.isEmpty()){
                arr.add((Character.toLowerCase(str.charAt(i))));
            }
            else{
                if(!arr.contains(Character.toLowerCase(str.charAt(i)))){
                    arr.add(Character.toLowerCase(str.charAt(i)));
                }
            }
        }

        System.out.println(arr.size());

        if(arr.size() == 26){
            System.out.println("pangram");
        }
        else{
            System.out.println("not pangram");
        }
    }
}
