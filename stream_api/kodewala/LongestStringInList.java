package stream_api.kodewala;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestStringInList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat","elephant","tiger","hippopotamus");
        String longest = words.stream().max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println(longest);
    }
}
