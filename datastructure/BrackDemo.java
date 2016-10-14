package com.datastructure;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by tinhv on 15/09/2016.
 */
public class BrackDemo {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            char[] str = s.toCharArray();

            Stack<Character> stack = new Stack();

            for(int i = 0; i < str.length; i++){

                if(str[i] == '{' || str[i] == '[' || str[i] == '('){
                    stack.push(str[i]);
                }
                else if(str[i] == '}' || str[i] == ']' || str[i] == ')'){
                    if(stack.isEmpty()){
                       // System.out.println("NO");
                        //stack.peek();
                    }
                    else {
                        if((stack.peek() == '{' || stack.peek() == '[' || stack.peek() == '(')){
                            stack.pop();
                        }
                        else{
                            //System.out.println("NO");
                        }
                    }
                }
            }
            if(stack.empty()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
