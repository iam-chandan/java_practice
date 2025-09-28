package collections.arrayList;

import java.util.ArrayList;

public class Remove {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(25);
        al.add(28);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al); // [10, 20, 25, 28, 30, 40, 50]
        al.remove(2);
        System.out.println(al); // [10, 20, 28, 30, 40, 50]
        al.remove(new Integer(28));
        System.out.println(al); // [10, 20, 30, 40, 50]
        ArrayList b = new ArrayList();
        b.add(30);
        b.add(40);
        System.out.println(b); // [30, 40]
        al.removeAll(b);
        System.out.println(al); // [10, 20, 50]
        al.clear();
        System.out.println(al); // []
    }
}
