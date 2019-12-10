package com.company;

public class LinkedList {

    private Node first;
    private Node last;

    //create a constructor
    public LinkedList() {
        first = null;
        last = null;
    }

    private boolean isEmpty() {
        return first == null;
    }

    //insertfirst method
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            last = newNode;
        }
        newNode.next = first; //newNode being assigned to old first
        first = newNode; //first node
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode; //the next value of the last node will point to the new node
            last = newNode; // we make the new node we created be the last one in the list
        }
    }

    public int deleteFirst() {
        int temp = first.data;
        if (first.next == null) {
            last = null;
        }
        first = first.next; //first will point to old next value
        return temp;
    }

    //print the list method
    public void displayList() {
        System.out.println("List (first --> last) ");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }


    public boolean searchList( int x) {
        System.out.println("Is it in the list: ");
        Node current = first;
        while (current != null) {
            if (current.data == x)
                return true;
            current = current.next;
        }
        return false;
    }













}
