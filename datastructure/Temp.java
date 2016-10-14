package com.datastructure;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * Created by tinhv on 16/09/2016.
 */
public class Temp {
    public static void main (String[] args) {
        String file = "/Working/predix-tmca-app/predix-auto-create/break";
        String result = "";

        try {
            String string = null;
            FileInputStream fis = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            while ((string = br.readLine()) != null){

                //System.out.println(string);
                char[] str = string.toCharArray();

                Stack<Character> stack = new Stack();

                for(int i = 0; i < str.length; i++){

                    if(str[0] == '}' || str[0] == ']' || str[0] == ')'){
                        result = "NO";
                    }
                    else{
                        if(str[i] == '{' || str[i] == '[' || str[i] == '('){
                            stack.push(str[i]);
                        }

                        if(!stack.isEmpty()){
                            if(str[i] == '}' && stack.peek() == '{'){
                                stack.pop();
                            }

                            else if(str[i] == ']' && stack.peek() == '['){
                                stack.pop();
                            }

                            else if(str[i] == ')' && stack.peek() == '('){
                                stack.pop();
                            }

                            if(stack.isEmpty()){
                                result = "YES";
                            }
                            else{
                                result = "NO";
                            }

                        }

                    }
                }
                System.out.println(result);
            }
            br.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

}
