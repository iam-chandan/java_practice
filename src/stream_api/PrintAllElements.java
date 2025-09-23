package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintAllElements {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abhijit","tushar","swarna","chinmay");
        list.stream().forEach(System.out::println);
        System.out.println("**********************");
        list.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println("***************************");
        System.out.println(list.stream().collect(Collectors.joining(" ")));
    }
}
