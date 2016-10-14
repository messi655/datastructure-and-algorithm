package com.collection;

import java.util.*;


/**
 * Created by tinhv on 08/09/2016.
 */
public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");


        List list1 = new ArrayList();
        list1.add("F");
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        list1.add("F");


        LinkedList link = new LinkedList();

        link.add("A");
        link.add("B");
        link.add("C");
        link.add("D");
        link.add("E");
        link.add("F");



        link.subList(0,2);


        Iterator itera = link.iterator();
        System.out.print("Linked list after sub list: ");
        while(itera.hasNext()){
            System.out.print(itera.next() + " ");
        }
        System.out.println();

        System.out.println(list.contains("A"));

        System.out.println(list1.lastIndexOf("F"));
        System.out.println(list1.indexOf("F"));




        System.out.println("Arrays List: " + Arrays.toString(list.toArray()));
    }

}
