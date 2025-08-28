package collections.arrayDeque;

import java.util.ArrayDeque;

public class Exmp1 {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        ad.add(40);
        ad.add(50);
        System.out.println(ad);
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());
    }
}
/*
[10, 20, 30, 40, 50]
10
50
 */