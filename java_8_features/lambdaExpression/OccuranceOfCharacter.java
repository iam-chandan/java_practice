package java_8_features.lambdaExpression;

import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceOfCharacter {
    public static void main(String[] args) {
        String str = "aabbccddeaaa";
        Map<Character,Long> ch = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c,Collectors.counting()));
        System.out.println(ch);
    }
}
