package com.tanea.Lab2;
import java.util.*;
public class Queue {

    private int arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;
}

    Queue(int size){

        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public int size(){
        return count;
    }

    public Boolean isEmpty(){
        return (size()==0);
    }

    public Boolean isFull(){
        return (size()==capacity);
    }

    public void enqueue(int item){
        if(isFull()){
            System.out.println("Queue if FULL");
            System.exit(1);
        }
        System.out.println("Inserting"+item);

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    public void dequeue(int item){
        if(isEmpty()){
            System.out.println("Queue if EMPTY");
            System.exit(1);
        }
        System.out.println("Removing"+arr[front]);

        front = (front + 1) % capacity;
        count--;
    }


