package com.github.andersori;

public class LinkedList<T>{
    
    private int size;
    private LinkedNode<T> root;
    private LinkedNode<T> last;

    public LinkedList(){
        this.size = 0;
        this.root = null;
        this.last = null;
    }

    public int getSize(){
        return this.size;
    }

    public T get(int pos){
        LinkedNode<T> result = this.getNode(pos);

        if(result != null){
            return result.getData();
        }

        throw new IndexOutOfBoundsException();
    }

    public void push(T data){
        LinkedNode<T> newNode = new LinkedNode<T>();
        newNode.setData(data);

        if(root == null){
            root = newNode;
            last = root;
        }
        else{
            last.setNext(newNode);
            last = newNode;
        }

        size++;
    }

    public void remove(int pos){

        if(pos == 0){
            root = root.getNext();
            size--;
        }
        else{
            LinkedNode<T> prev = getNode(pos-1);
            
            if(prev != null){
                LinkedNode<T> remov = prev.getNext();
                prev.setNext(remov.getNext());

                size--;
            }
        }
    }

    private LinkedNode<T> getNode(int pos){

        if(pos >= 0 && pos < size){
            LinkedNode<T> temp = root;

            for(int i = 0; i < size; i++){
                if(i == pos){
                    break;
                }
                temp = temp.getNext();
            }

            return temp;
        }
        else{
            return null;
        }
    }
}