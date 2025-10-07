package stream_api.kodewala;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one","three","five","four","six");
        Map<Integer,List<String>> grp= words.stream().collect(Collectors.groupingBy(n -> n.length()));
        System.out.println(grp);
    }
}
