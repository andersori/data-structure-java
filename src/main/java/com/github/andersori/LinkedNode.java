package com.github.andersori;

public class LinkedNode<T>{

    private T data;
    private LinkedNode<T> next;

    public LinkedNode(){

    }

    void setData(T data){
        this.data = data;
    }

    T getData(){
        return this.data;
    }

    void setNext(LinkedNode<T> next){
        this.next = next;
    }

    LinkedNode<T> getNext(){
        return this.next;
    }
    
}