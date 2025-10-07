package stream_api.kodewala;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindAllDuplicateElements {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,2,4,5,1);
        Set<Integer> duplicates = num.stream().filter(n -> Collections.frequency(num,n) > 1).collect(Collectors.toSet());
        System.out.println(duplicates);
    }
}
