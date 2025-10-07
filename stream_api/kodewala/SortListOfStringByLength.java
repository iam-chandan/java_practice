package stream_api.kodewala;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfStringByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana","apple","kiwi","grape");
        words.stream().sorted(Comparator.comparingInt(w -> w.length())).forEach(System.out::println);
    }
}
