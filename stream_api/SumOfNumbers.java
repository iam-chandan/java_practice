package stream_api;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(5,8,6,7,2,3);
        int sum = num.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum : " + sum); // sum : 31

        int summation = num.stream().reduce(0,(a,b)->a+b);
        System.out.println("summation : " + summation); //summation : 31
    }
}
