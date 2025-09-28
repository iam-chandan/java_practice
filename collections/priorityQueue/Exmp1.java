package collections.priorityQueue;

import java.util.PriorityQueue;

public class Exmp1 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(120);
        pq.add(20);
        pq.add(310);
        pq.add(40);
        pq.add(230);
        pq.add(150);
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
/*
[20, 40, 150, 120, 230, 310]
20
 */