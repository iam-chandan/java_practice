package stream_api;

import java.util.Arrays;
import java.util.List;

public class FindSquareOfNumbers {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,5,8,6,3,7);
        List<Integer> square = num.stream().map(n -> n * n).toList();
        System.out.println(square); // [4, 25, 64, 36, 9, 49]
        num.stream().map(n -> n * n).forEach(s -> System.out.print(s + " ")); // 4 25 64 36 9 49

    }
}
