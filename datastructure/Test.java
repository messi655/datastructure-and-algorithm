package com.datastructure;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by tinhv on 08/09/2016.
 */
public class Test {

    public void print1(){
        int a = 10;
        int b = 20;
        System.out.printf("a: %d b: %d",a,b);
    }

    int max(int a, int b)
    {
        return (a >= b) ? a : b;
    }

    int max2(int a, int b){
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }



     public static void main(String[] args) {
         Test test = new Test();


         Stack<Character> stack = new Stack();
         Stack<Character> resolve = new Stack();

         String abc = "{[(())]}";
         char[] str = abc.toCharArray();

         System.out.println("array devide 2: " + str.length%2);

         for(int i = 0; i < str.length; i++){
             stack.push(str[i]);
         }


         for(char c: stack){
             System.out.print(c + " ");
         }
         System.out.println();
         System.out.println(" Size of stack: " + stack.size());
         System.out.println(" Size of stack / 2: " + stack.size()/2);

         for(int j = -1; j <= ((stack.size())/2); j++){
             resolve.push(stack.pop());
         }

         System.out.println(resolve.size());

         for(char s: resolve){
             System.out.print(s + " ");
         }


     }



}


