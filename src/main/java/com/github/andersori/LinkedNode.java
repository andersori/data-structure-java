package com.github.andersori;

public class LinkedNode<T>{

    private T data;
    private LinkedNode<T> next;

    public LinkedNode(){
        next = null;
    }

    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public void setNext(LinkedNode<T> next){
        this.next = next;
    }

    public LinkedNode<T> getNext(){
        return next;
    }
    
}