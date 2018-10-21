package com.tanea.Lab2;

public class Main {
    public static void main(String[] args) {

        Queue q = new Queue(6);

        q.enqueue(1);
        q.enqueue(1);
        q.enqueue(1);

        q.dequeue();

        q.dequeue();

        if(q.isEmpty())
            System.out.println("Queue is empty");
        else
            System.out.println("Queue is not empty");
    }
}