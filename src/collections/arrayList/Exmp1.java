package collections.arrayList;

import java.util.ArrayList;

public class Exmp1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al); // [10, 20, 30, 40, 50]
        al.add(2,25);
        System.out.println(al); // [10, 20, 25, 30, 40, 50]
        ArrayList b = new ArrayList();
        b.add(60);
        b.add(70);
        b.add(80);
        System.out.println(b); // [60, 70, 80]
        al.addAll(b);
        System.out.println(al); // [10, 20, [60, 70, 80], 25, 30, 40, 50]
        al.add(2,b);
        System.out.println(al); // [10, 20, [60, 70, 80], 25, 30, 40, 50, 60, 70, 80]
    }
}
