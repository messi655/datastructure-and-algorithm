package com.datastructure;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by tinhv on 09/09/2016.
 */
public class Test2 {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("max area=" + area(a));

    }

    static int area(int[] a) {
        int i = 0;
        int area = 0;
        int maxArea = 0;

        Stack<Integer> st = new Stack<>();

        for (i = 0; i < a.length; i++) {
            if (st.isEmpty() || a[st.peek()] <= a[i]) {
                st.push(i);
                System.out.println("Stack value: " + st.peek());
            } else {
                int x = st.pop();
                if (st.isEmpty()) {
                    area = a[x] * i;
                } else {
                    area = a[x] * (i - st.peek() - 1);
                }
                if (area > maxArea)
                    maxArea = area;
            }
        }

        System.out.println("====================================");

        while (!st.isEmpty()) {
            int x = st.pop();
            System.out.println("Get value x in stack: " + x);
            if (st.isEmpty()) {
                area = a[x] * i;
            } else {
                area = a[x] * (i - st.peek() - 1);
                System.out.println("Value i: " + i);
                System.out.println("st.peek(): " + st.peek());
                System.out.println("value at step a[x] * (i - st.peek() - 1): " + area);
            }
            if (area > maxArea)
                maxArea = area;
        }
        return maxArea;
    }
}
