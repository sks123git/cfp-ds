package com.linkedlist;

public class Driver {
    public static void main(String[] args) {
        LinkedListMain list1 = new LinkedListMain();
        list1.insert(10);
        list1.insert(20);
        list1.append(30);
        System.out.println();
        list1.display();
        System.out.println();
        list1.insertBetween(50,30);
        list1.display();
    }
}
