package com.chaddrennan;

/*
Generic class/template - T is abbreviation for type




 */

public class StackOfStrings<T> {
    private class Node<T> {
        T item;
        Node next;

    }

    // Fields:
    private Node<T> front;


    public StackOfStrings() {
        front = null;
    }

    public void push(T item) {
        Node newFront = new Node();
        newFront.item = item;
        newFront.next = front;
        front = newFront;
    }

    public T pop() {
        if (front == null) {
            return null; // or throw an exception
        }
        T topItem = front.item;
        front = front.next;
        return topItem;
    }

    public boolean isEmpty(){
        return front == null;
    }
}
/*
Array compared to linkedlist for implementing a stack

linked lists use more memory since you must count reference node and data besides the front node reference.
The array only must track the contents besides the size field

Ken's general rule: after a thousand items a linked list is better. before an array is better.



 */