package com.github.andersori;

public class StackMain{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        while(stack.getSize() != 0){
            System.out.println(stack.top());
            stack.pop();
        }

        System.out.println("Tamanho: " + stack.getSize());
    }
}