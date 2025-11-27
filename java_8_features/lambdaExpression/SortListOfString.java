package java_8_features.lambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListOfString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","mango","banana","grapes");
        Collections.sort(list,(a,b)->b.compareTo(a));
        System.out.println("sorted list : " + list);
    }
}
