package com.stack;
//Stack implementation of an array
public class StackImplementation {
    static final int MAX = 100;
    static int[] array = new int[MAX];
    static int top = -1;
    public void push(int data){
        if (top == MAX-1){
            System.out.println("overflow");
        } else {
            top++;
            array[top] = data;
        }
    }
    public void pop(){
        if (top == -1){
            System.out.println("stack is empty");
        } else {
            top --;
        }
    }
    public void displayAll(){
        for (int i=0; i<=top; i++) {
            System.out.print(" " + array[i]);
        }
    }
    public static void main(String[] args) {
StackImplementation stackImplementation = new StackImplementation();
stackImplementation.push(10);
        stackImplementation.push(20);
        stackImplementation.displayAll();
    }
}
