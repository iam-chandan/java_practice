package java_8_features.lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class IterateOverListUsingForEachAndLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "David", "Alex");
        names.parallelStream().forEach(n -> System.out.print(n + " "));
    }
}
