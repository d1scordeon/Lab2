package com.company.main.queue;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class DoubleEndedQueue<T> implements Iterable<T> {
    static class Node<T> {
        T element;
        Node<T> previous;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private Node<T> currentNode;

    public void push(T item) {
        Node<T> newNode = new Node<T>(item);

        if (head == null) {
            head = tail = newNode;
            //head's previous will be null  
            head.previous = null;
            //tail's next will be null  
        } else {
            //add newNode to the end of list. tail->next set to newNode  
            tail.next = newNode;
            //newNode->previous set to tail  
            newNode.previous = tail;
            //newNode becomes new tail  
            tail = newNode;
            //tail's next point to null  
        }
        tail.next = null;
    }

    public T pop() {
        Node<T> current = head;
        if (head == null) {
            System.out.println("Doubly linked list is empty");
            return null;
        }
        Node<T> node = tail;
        tail = tail.previous;
        tail.next = null;
        return node.element;
    }

    public void printNodes() {
        Node<T> current = head;
        if (head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }
    }

    @Override
    public Iterator<T> iterator() {
        currentNode = head;
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public T next() {
                T value = currentNode.element;
                currentNode = currentNode.next;
                return value;
            }
        };
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        currentNode = head;
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}