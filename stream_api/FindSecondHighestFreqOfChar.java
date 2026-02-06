package stream_api;

import java.util.Map;
import java.util.stream.Collectors;

public class FindSecondHighestFreqOfChar {
    public static void main(String[] args) {
        String str = "abcdabcdefabcab";
        Map<Character,Long> freq = str.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        long highest = freq.values().stream().mapToLong(l -> (long) l).max().orElse(0);
        long secondHighest = freq.values().stream().filter(e -> e < highest).mapToLong(l -> (long) l).max().orElse(0);
        freq.entrySet().stream()
                .filter(e -> e.getValue() < highest && e.getValue() < secondHighest)
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println(freq);
    }
}
