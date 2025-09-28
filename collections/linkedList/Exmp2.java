package collections.linkedList;

import java.util.LinkedList;

public class Exmp2 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.push(50);
        System.out.println(ll);
        System.out.println(ll.pop());
        System.out.println(ll);
        System.out.println(ll.peek());
        System.out.println(ll);
    }
}
/*
[50, 40, 30, 20, 10]
50
[40, 30, 20, 10]
40
[40, 30, 20, 10]
 */