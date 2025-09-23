package stream_api;

import java.util.Arrays;
import java.util.List;

public class SortStrings {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("bob","Boby","apple","bat","dog","Cat");
        List<String> sorted = elements.stream().sorted().toList();
        System.out.println(sorted); // [Boby, Cat, apple, bat, bob, dog]
    }
}
