package com.arraylist;

public class Arraylist {
    int[] array;
    int capacity;
    int top;
    Arraylist(){
        capacity = 10;
        top = -1;
        array = new int[capacity];
    }

    void add(int data){
        if (top==capacity-1){
            int[] temp = new int[capacity];
            for (int i = 0; i <= top; i++) {
                temp[i] = array[i];
            }
            capacity = capacity * 3/2 + 1;
            array = new int[capacity];
            for (int i = 0; i <= top; i++) {
                array[i] = temp[i];
            }
        }
        top++;
        array[top]=data;
    }

    void displayAll(){
        for (int i = 0; i <= top; i++) {
            System.out.print(" "+array[i]);
        }
    }

    int get(int index){
        return array[index];
    }

    void delete(int data){
        int flag = 0;
        for (int i = 0; i <= top; i++) {
            if (array[i]==data && i==top){
                top--;
                flag=1;}
            else if (array[i]==data){
                top--;
                for (int j = i; j <= top ; j++) {
                    array[j]=array[j+1];
                }
                flag=1;
            }
        }
        if (flag!=1){
            System.out.println("data not found");
        }
    }
}
