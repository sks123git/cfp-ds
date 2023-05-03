package com.linkedlist;

public class Driver {
    public static void main(String[] args) {
        LinkedListMain list1 = new LinkedListMain();
        list1.insert(10);
        list1.insert(20);
        list1.append(30);
        list1.display();
        list1.delete();
        System.out.println();
        list1.display();
    }
}
