package com.arraylist;
//Arraylist implementation using array
public class Main {
    public static void main(String[] args) {
        Arraylist list = new Arraylist();
        for (int i = 0; i < 15; i++) {
            list.add(i+1);
        }
        list.displayAll();
        list.delete(12);
        System.out.println();
        list.displayAll();
    }
}
