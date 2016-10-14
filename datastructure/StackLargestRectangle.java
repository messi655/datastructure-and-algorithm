package com.datastructure;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by tinhv on 16/09/2016.
 */
public class StackLargestRectangle {

    public static int largest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] h = new int[n + 1];
        int[] l = new int[n + 1];
        // keep on the stack current height and length (how long is until next different height)
        long max = 0;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            int b = in.nextInt();
            // if new height 'b' is higher from the last height on stack, put new height on stack with length = 1
            System.out.println("b: " + b);
            System.out.println("h[count - 1]: " + h[count - 1]);
            if (b > h[count - 1]) {
                h[count] = b;
                System.out.println("h[count]: " + h[count]);
                l[count] = 1;
                System.out.println("l[count]: " + l[count]);
                count++;
                System.out.println("count++: " + count);
                System.out.println("==========================");
            } else {
                // if new height 'b' is equal or smaller than last height on stack, prepare cumulative length 'c' for all height on stack that are smaller and check if current rectangle with cumulative length is bigger than max
                int c = 0;
                while (count > 1 && h[count - 1] >= b) {
                    count--;
                    c += l[count];
                    if (h[count] * c > max) {
                        max = h[count] * c;
                    }
                }
                // add on stack current height with cumulative length 'c' increased by 1
                h[count] = b;
                l[count] = c + 1;
                count++;
            }
        }

        System.out.println("Array list h[count]: " + Arrays.toString(h));
        System.out.println("Array list l[count]: " + Arrays.toString(l));
        System.out.println("========================================");
        // repeat the proces of removing all heights from stack and checking their area against max respectively
        int c = 0;
        while (count > 1) {
            count--;
            System.out.println("count--: " + count);

            c += l[count];

            System.out.println(" c += l[count]: " + c);
            System.out.println("h[count] * c > max: " + (h[count] * c > max));
            if (h[count] * c > max) {
                max = h[count] * c;
                System.out.println("max value: " + max);
            }

            System.out.println("------------------");
        }
        System.out.println(max);
    }
}
