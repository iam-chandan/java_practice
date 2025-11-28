package java_8_features.lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class ToUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("anna", "bob", "charlie");
        List<String> res = names.stream().map(s -> s.toUpperCase()).toList();
        System.out.println(res);
    }
}
