package stream_api;

import java.util.Arrays;
import java.util.List;

public class Flatten_a_List_of_Lists {
    public static void main(String[] args) {
        List<List<Integer>> nums = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5),Arrays.asList(6,7,8,9));
        List<Integer> flattenedArray1 = nums.stream().flatMap(List::stream).toList();
        System.out.println(flattenedArray1);

        List<Integer> flattenedArray2 = nums.stream().flatMap(List->List.stream()).toList();
        System.out.println(flattenedArray2);
    }
}
