package stream_api.kodewala;

import java.util.Map;
import java.util.stream.Collectors;


public class CountFrequencyOfEachCharacter {
    public static void main(String[] args) {
        String input = "banana";
        Map<Character,Long> freq = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c,Collectors.counting()));
        System.out.println(freq);
    }
}
