package code;

import java.util.*;

public class Linkedlist extends Thread {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(11);
        l1.add(22);
        l1.add(33);
        l1.add(44);
        l1.add(55);
        l1.add(77);
        l1.add(5, 77); // Inserts 77 at index 5
        System.out.println("L1 Linked list : " + l1);

        l1.remove(2); // removes element present at 2nd index
        System.out.println("L1 Linked list after removing element present at 2nd index: " + l1);

        l1.set(2, 10); // changes element present at 2nd index (33 changed to 10)
        System.out.println("L1 Linked list after changing element present at 2nd index to 10: " + l1);

        l1.addLast(100); // Inserting 100 at the end of L1
        System.out.println("L1 Linked list after inserting element at last index: " + l1);

        l1.addFirst(0); // Inserting 0 at the starting of L1
        System.out.println("L1 Linked list after inserting 0 at the starting of L1: " + l1);

        System.out.print("L1 Linked list elements: ");
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(" ");
        }
    }
}