package com.github.andersori;

public class Queue<T>{

    private int size;
    private LinkedNode<T> first;
    private LinkedNode<T> last;

    public Queue(){
        size = 0;
        first = null;
        last = null;
    }

    public int getSize(){
        return size;
    }

    public void push(T data){
        LinkedNode<T> newNode = new LinkedNode<>();
        newNode.setData(data);

        if(last == null){
            first = newNode;
            last = first;
        }
        else{
            last.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    public void pop(){
        if(first != null){
            first = first.getNext();
            size--;
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }

    public T front(){
        
        if(first != null){
            return first.getData();
        }
        else{
            return null;
        }
    }
}