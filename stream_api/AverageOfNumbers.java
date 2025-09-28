package stream_api;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(5,8,6,7,52,78,9,3);
        double avg1 = num.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("average : " + avg1); // average : 21.0

        int sum = num.stream().reduce(0,(a,b) -> a + b);
        System.out.println("average : " + (double)sum/num.size()); // average : 21.0
    }
}
