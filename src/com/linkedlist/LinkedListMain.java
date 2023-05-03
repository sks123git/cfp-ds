package com.linkedlist;

public class LinkedListMain {

    Node head = null;
    Node tail = null;

    public void insert(int data){
        Node newNode = new Node();
        newNode.setData(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            head=newNode;
            newNode.setNext(temp);
        }
    }
    public void append(int data){
        Node newNode = new Node();
        newNode.setData(data);
        if (tail==null){
            tail=newNode;
            head=newNode;
        } else {
            tail.setNext(newNode);
            tail=newNode;
        }
    }
    public void delete(){
        if (tail==null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp.getNext().getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(null);
        tail=temp;
    }
    public void display(){
        Node temp = head;
        if (temp==null){
            System.out.println("list is empty");
            return;
        }
        while (temp!=null){
            System.out.print(temp.toString());
            temp=temp.getNext();
        }
    }
}
