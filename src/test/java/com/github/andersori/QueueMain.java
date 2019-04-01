package com.github.andersori;

public class QueueMain{
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        for (int i = 0; i < 10; i++) {
            queue.push(i);
        }

        while(queue.getSize() != 0){
            System.out.println(queue.front());
            queue.pop();
        }
    }
}