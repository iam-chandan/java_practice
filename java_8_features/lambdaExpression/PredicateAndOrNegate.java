package java_8_features.lambdaExpression;

import java.util.function.Predicate;

public class PredicateAndOrNegate {
    public static void main(String[] args) {
        Predicate<Integer> p1 = (x) -> x > 10;
        Predicate<Integer> p2 = (x) -> x < 20;

        boolean res1 = p1.and(p2).test(12);
        boolean res2 = p1.or(p2).negate().test(15);
        System.out.println(res1);
        System.out.println(res2);
    }
}
