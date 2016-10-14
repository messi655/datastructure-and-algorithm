package com.algorithm;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Created by tinhv on 05/10/2016.
 */
public class Test2 {

    public static void main(String[] args) {
        String file = "/Working/predix-tmca-app/predix-auto-create/break";
        SharlockArraySum ss = new SharlockArraySum();

        try {
            String string = null;
            FileInputStream fis = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            while ((string = br.readLine()) != null) {

                //System.out.println(string);
                String[] str =string.split(" ");
                int[] arr = new int[str.length];
                int sum = 0;
                for(int i = 0; i < str.length; i++){
                    arr[i] = Integer.parseInt(str[i]);
                }
                //ss.checkIfLeftEqualToRight(arr);
                ss.numberBalance(arr);
                //System.out.println("Summmmmmmmm: " + sum);
                System.out.println("=====================================");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
