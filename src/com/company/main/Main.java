package com.company.main;

import com.company.main.queue.DoubleEndedQueue;

public class Main {
    public static void main(String[] args) {
        //Task one
        DoubleEndedQueue<Integer> doubleEndedQueue = new DoubleEndedQueue<Integer>();
        doubleEndedQueue.push(10);
        doubleEndedQueue.push(20);
        doubleEndedQueue.push(30);
        doubleEndedQueue.push(40);
        doubleEndedQueue.push(50);

        System.out.println(doubleEndedQueue.pop());
        System.out.println(doubleEndedQueue.pop());

        for (Integer i : doubleEndedQueue) {
            System.out.println(i);
        }
    }
}