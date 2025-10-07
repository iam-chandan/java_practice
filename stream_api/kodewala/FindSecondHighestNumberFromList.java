package stream_api.kodewala;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighestNumberFromList {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(10,20,30,40,50);
        Optional<Integer> secondHighest = num.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        num.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
        System.out.println(secondHighest);
    }
}
