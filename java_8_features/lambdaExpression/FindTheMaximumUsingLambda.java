package java_8_features.lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class FindTheMaximumUsingLambda {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,7,85,3,8,5,10);
        int max = list.stream().max((a,b) -> a.compareTo(b)).get();
        System.out.println("maximum nymber : " + max);
    }
}
