package collections.problems;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Ropes {
    public static int countCostOfRope(PriorityQueue<Integer> rope){
        int totalCost = 0;
        int sum = 0;
        while (rope.size() > 1){
            int r1 = rope.poll();
            int r2 = rope.poll();
            sum = r1 + r2;
            totalCost += sum;
            rope.add(sum);
        }
        return totalCost;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        PriorityQueue<Integer> rope =  new PriorityQueue<Integer>();
        for (int i = 0; i < n; i++) {
            int length = scn.nextInt();
            rope.add(length);
        }
        System.out.println(countCostOfRope(rope));
    }
}
