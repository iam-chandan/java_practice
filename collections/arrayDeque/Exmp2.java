package collections.arrayDeque;

import java.util.ArrayDeque;

public class Exmp2 {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.push(10);
        ad.push(20);
        ad.push(30);
        ad.push(40);
        ad.push(50);
        System.out.println(ad);
        System.out.println(ad.pop());
        System.out.println(ad);
    }
}
/*
[50, 40, 30, 20, 10]
50
[40, 30, 20, 10]
 */