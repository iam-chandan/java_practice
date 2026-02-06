package stream_api;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstOccuranceOfUniqueElement {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(7,5,8,7,6,9,3,4,5,4,6,2,7,6,5);

        //way - 1 (without using entrySet())
        Map<Integer, Long> frequency = num.stream()
                        .collect(Collectors.groupingBy(
                                Function.identity(),   // key = number itself
                                LinkedHashMap::new,    // preserve insertion order
                                Collectors.counting()  // count occurrences
                        ));

        System.out.println(frequency);
        Integer freq = num.stream().filter(n -> frequency.get(n) == 1).findFirst().orElse(null);
        System.out.println(freq);

        //way - 2 (with using entrySet())
        Integer uniqueEle = num.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),   // key = number itself
                        LinkedHashMap::new,    // preserve insertion order
                        Collectors.counting()  // count occurrences
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .skip(1) // for 2nd unique number i have used skip(1) if first remove this
                .findFirst()
                .orElse(null);
        System.out.println(uniqueEle);
    }
}
