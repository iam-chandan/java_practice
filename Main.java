import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,4,7,1,8,5);
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(Integer i : list){
            if(!set.add(i)){
                set2.add(i);
            }
        }
        System.out.println(set2);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = list.stream().filter(n -> !seen
                .add(n)).collect(Collectors.toSet());
        System.out.println("unique : " + seen);
        System.out.println("duplicate : " + duplicate);

        List<Integer>  list1 = Arrays.asList(10,20,30,40,50,10,40);
        List<Integer> reversed = IntStream.range(0, list1.size())
                                .mapToObj(i -> list1.get(list1.size() - 1 - i))
                                .toList();
        list1.stream().distinct().sorted((a,b) -> b - a).skip(2).limit(1).findFirst().ifPresent(System.out::println);
        System.out.println("reversed : " + reversed);
    }
}
