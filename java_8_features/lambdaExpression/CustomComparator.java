package java_8_features.lambdaExpression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CustomComparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "kiwi", "banana", "cat", "bat", "dog");

        list.sort((s1,s2) -> {

            int len = Integer.compare(s1.length(),s2.length());
            if(len == 0){
                return s1.compareTo(s2);
            }
            return len;
        });

//        list.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
        System.out.println(list);
    }
}
