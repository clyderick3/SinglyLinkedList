package com.zipcodewilmington.singlylinkedlist;

import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    static LinkedList<String> linky = new LinkedList<String>();

    public static void addList(){
        linky.add("Sarah");
        linky.add("Samuel");
        linky.add("Susan");

    }

    public static void main(String[] args) {
        addList();
        System.out.println(linky);
    }
}
