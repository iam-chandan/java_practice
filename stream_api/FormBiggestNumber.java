package stream_api;

import java.util.*;
import java.util.stream.Collectors;

public class FormBiggestNumber {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("234","5426","87","96","542");

        String res = list.stream().sorted((a,b) -> (b+a).compareTo(a+b)).reduce("",String::concat);

        String str = list.stream().sorted((a,b) -> (b+a).compareTo(a+b)).collect(Collectors.joining());
        System.out.println(res);
        System.out.println(str);
    }
}
