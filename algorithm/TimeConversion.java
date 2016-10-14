package com.algorithm;

import java.util.Scanner;

/**
 * Created by tinhv on 22/09/2016.
 */
public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();

        String[] str = time.split(":");


        if (str[str.length - 1].contains("PM") && Integer.parseInt(str[0]) < 12) {
            int hour = Integer.parseInt(str[0]) + 12;
            str[0] = Integer.toString(hour);
            System.out.println(str[0] + ":" + str[1] + ":" + str[2].replace("PM"," "));
        }
        if (str[str.length - 1].contains("PM") && Integer.parseInt(str[0]) == 12) {
            System.out.println(str[0] + ":" + str[1] + ":" + str[2].replace("PM"," "));
        }

        if(str[str.length - 1].contains("AM") && Integer.parseInt(str[0]) != 12){
            System.out.println(str[0] + ":" + str[1] + ":" + str[2].replace("AM"," "));
        }
        if(str[str.length - 1].contains("AM") && Integer.parseInt(str[0]) == 12){

            System.out.println("00" + ":" + str[1] + ":" + str[2].replace("AM"," "));
        }
    }


}
