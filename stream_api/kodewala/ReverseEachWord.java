package stream_api.kodewala;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        String sentence = "Kodewala is Java Training Academy";
        String reverseWord = Arrays.stream(sentence.split(" ")).map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(reverseWord);
    }
}
