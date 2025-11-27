package java_8_features.lambdaExpression;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<Integer,Integer> f1 = (x) -> x + 5;
        Function<Integer,Integer> f2 = (x) -> x * 2;

        int res1 = f1.andThen(f2).apply(10); // first add with 5 then will multiply with 2

        int res2 = f1.compose(f2).apply(10); // first multiply with 2 then will add with 5
        System.out.println("andThen() : " + res1);
        System.out.println("compose() : " + res2);
    }
}
