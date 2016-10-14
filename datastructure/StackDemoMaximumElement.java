package com.datastructure;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by tinhv on 14/09/2016.
 */
public class StackDemoMaximumElement {


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        for(int i = 1; i <= n; i++){
           int query = scan.nextInt();

            if(query == 1){
                int element = scan.nextInt();
                if(stack.isEmpty()){
                    stack.push(element);
                }
                else{
                    stack.push(Math.max(element,stack.pop()));
                    stack.push(stack.peek());
//                    for(Integer in: stack){
//                        System.out.println(in);
//                    }
                }
            }

            if(query == 2){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }

            if(query == 3){
                if(!stack.isEmpty()) {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}
