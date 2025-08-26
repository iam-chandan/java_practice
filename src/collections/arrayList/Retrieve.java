package collections.arrayList;

import java.util.ArrayList;

public class Retrieve {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al); // [10, 20, 30, 40, 50]
        System.out.println(al.get(2)); // 30
        System.out.println(al.subList(0,3)); // [10, 20, 30]
        System.out.println(al.indexOf(30)); // 2
        al.add(30);
        System.out.println(al.lastIndexOf(30)); // 5
    }
}
