package com.github.andersori;

public class DoublyLinkedList<T>{

    private int size;
    private DoublyNode<T> root;
    private DoublyNode<T> last;

    public DoublyLinkedList(){
        size = 0;
        root = null;
        last = null;
    }

    public int getSize(){
        return this.size;
    }

    public T get(int pos){

        DoublyNode<T> result = getNode(pos);

        if(result != null){
            return result.getData();
        }

        throw new IndexOutOfBoundsException();
    }

    public void push(T data){
        DoublyNode<T> newNode = new DoublyNode<>();
        newNode.setData(data);

        if(root == null){
            root = newNode;
            last = root;
        }
        else{
            newNode.setPrev(last);
            last.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    public void remove(int pos){
        DoublyNode<T> result = getNode(pos);

        if(result != null){
            DoublyNode<T> prev = result.getPrev();
            DoublyNode<T> next = result.getNext();

            if(prev != null){
                prev.setNext(next);
            }

            if(next != null){
                next.setPrev(prev);
            }

            size--;
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }

    private DoublyNode<T> getNode(int pos){

        if(pos >= 0 && pos < size){
            DoublyNode<T> temp = root;

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