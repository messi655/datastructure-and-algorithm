package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by tinhv on 22/09/2016.
 */
public class CompareTheTriplets {
    public static void main(String[] args) {
        ArrayList<Integer> alice = new ArrayList<Integer>();
        ArrayList<Integer> bob = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        alice.add(a0);
        alice.add(a1);
        alice.add(a2);

        bob.add(b0);
        bob.add(b1);
        bob.add(b2);
        int a_result = 0;
        int b_result = 0;

        for(int i = 0; i < alice.size(); i++){
            if(alice.get(i) > bob.get(i)){
                a_result += 1;
            }
            else if(alice.get(i) < bob.get(i)){
                b_result += 1;
            }
            else{
                a_result += 0;
                b_result += 0;
            }
        }
        System.out.print(a_result + " " + b_result);
    }
}
