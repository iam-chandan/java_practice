package collections.linkedList;

import java.util.LinkedList;

public class Exmp1 {
    public static void main(String[] args) {
        LinkedList ll =  new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.println(ll);
        ll.addFirst(5);
        System.out.println(ll);
        ll.addLast(60);
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.peek());
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
        System.out.println(ll.pollFirst());
        System.out.println(ll.pollLast());
    }
}

/*
[10, 20, 30, 40, 50]
[5, 10, 20, 30, 40, 50]
[5, 10, 20, 30, 40, 50, 60]
5
60
5
5
60
5
60
 */