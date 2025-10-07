package stream_api.kodewala;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoListsRemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(3,4,5);
        List<Integer> merge = Stream.concat(list1.stream(),list2.stream()).distinct().collect(Collectors.toList());
        System.out.println(merge);
    }
}
