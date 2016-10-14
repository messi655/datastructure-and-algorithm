package com.algorithm;

/**
 * Created by tinhv on 26/09/2016.
 */
public class BeautifulBinaryString {
    public static void main(String[] args) {
        String str = "0101010";

        //System.out.println((str.length() - str.replaceAll("010","").length())/2);

//        System.out.println(str.substring(0,3));
//        System.out.println(str.substring(3));

        int result = 0;
        for(int i = 0; i <= str.length() - 3; i++){

            if(str.substring(i,i+3).equalsIgnoreCase("010")){
                result += 1;
                str = str.substring(i+2);
                System.out.println("After sub: " + str);
                //i = 0;
            }


        }
        System.out.println(result);
    }
}
