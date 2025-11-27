package java_8_features.lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumbersFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,7,85,3,8,5,10);
        List<Integer> result = list.stream().filter(n -> n%2 == 0).toList();
        System.out.println(result);
    }
}
