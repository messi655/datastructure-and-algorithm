package com.datastructure;

import java.util.*;

/**
 * Created by tinhv on 19/09/2016.
 */
public class QueueDownToZeroTwo {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        for(int i = 0; i < q; i++){

            if(queue.isEmpty()){
                queue.add(scan.nextInt());
            }
            else{
                if(!queue.isEmpty()){
                    queue.add(Math.max(scan.nextInt(),queue.poll()));
                }
            }
        }

        Iterator iter = queue.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
