package com.datastructure;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by tinhv on 20/09/2016.
 */
public class QueueUsingTwoStack {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Queue<Integer> queue = new LinkedList<Integer>();

        for(int i = 0; i < n; i++){
            int type = scan.nextInt();

            if(type == 1){
                int x = scan.nextInt();
                queue.add(x);
            }
            else if(type == 2){
                queue.remove();

            }
            else if(type == 3){
                System.out.println(queue.peek());
            }
        }
    }
}
