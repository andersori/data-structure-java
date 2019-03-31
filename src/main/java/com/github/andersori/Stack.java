package com.github.andersori;

public class Stack<T>{

    private int size;
    private LinkedNode<T> top;

    public Stack(){
        size = 0;
        top = null;
    }

    public int getSize(){
        return size;
    }

    public void push(T data){
        LinkedNode<T> newNode = new LinkedNode<>();
        newNode.setData(data);
        
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public T top(){
        return top.getData();
    }

    public void pop(){

        if(top != null){
            top = top.getNext();
            size--;
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }

}