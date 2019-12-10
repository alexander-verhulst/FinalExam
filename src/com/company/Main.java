package com.company;

public class Main {

    public static int fiboRecursive (int n){
        if (n ==1 || n==0) {
            return 1;
        }
        else {
            return fiboRecursive(n-1) + fiboRecursive(n - 2);
        }
    }

    public static void main(String[] args) {

        System.out.println("Fibonacci Recursive");
        System.out.println(fiboRecursive(13));


        System.out.println();
        LinkedList myList = new LinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(90);
        myList.insertFirst(88); //displayed first and goes up
        myList.insertLast(999999999); //puts the value at the end of list, after 100
        myList.displayList();


        System.out.println();
        System.out.println(myList.searchList(100));










    }
}
