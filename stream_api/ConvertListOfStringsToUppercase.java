package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConvertListOfStringsToUppercase {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","ball","cat","dog");
        List<String> word = words.stream().map(String::toUpperCase).toList();
        System.out.println(word);
        words.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
    }
}
