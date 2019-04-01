package com.github.andersori;

public class DoublyMain{
    public static void main(String[] args) {
        DoublyLinkedList<Integer> lst = new DoublyLinkedList<>();

        for (int i = 0; i < 10; i++) {
            lst.push(i);
        }

        lst.remove(3);//3
        lst.remove(6);//7

        for(int i = 0; i < lst.getSize(); i++){
            System.out.println(lst.get(i));
        }
    }
}