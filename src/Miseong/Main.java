package Miseong;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Special methods for LinkedList
        LinkedList l = new LinkedList();

        l.add("dog");
        l.add("dog"); // duplication is allowed in LL
        l.add("cat");
        l.add("horse");

        l.addFirst("Tiger");
        l.addLast("Elephant");
        System.out.println(l.getFirst()); // Tiger
        System.out.println(l.getLast()); // Elephant
        l.removeFirst();
        System.out.println(l); // [dog, dog, cat, horse, Elephant]
    }}





