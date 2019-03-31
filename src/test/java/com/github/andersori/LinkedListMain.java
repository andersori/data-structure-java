package com.github.andersori;

import com.github.andersori.LinkedList;

public class LinkedListMain{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        for (int i = 0; i < 10; i++) {
            list.push(i);
        }

        list.remove(2);
        list.remove(5);

        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }

    }
}