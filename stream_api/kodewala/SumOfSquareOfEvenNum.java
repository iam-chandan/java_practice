package stream_api.kodewala;

import java.util.Arrays;
import java.util.List;

public class SumOfSquareOfEvenNum {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        int sum = num.stream().filter(n -> n % 2 == 0).mapToInt(n -> n * n).sum();
        int summation = num.stream().filter(n -> n % 2 == 0).map(n -> n * n).reduce(0,(a,b) -> a + b);
        System.out.println(sum);
        System.out.println(summation);
    }
}
