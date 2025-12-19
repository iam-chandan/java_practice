package stream_api;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5,3, 1, 2, 1, 4, 5);
        Integer li = list.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(n -> n.getValue() == 1)
                .map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(li);
        findFirstNonRepeatingElement1();
        findFirstNonRepeatingElement2();
        findFirstNonRepeatingElement3();
        findFirstNonRepeatingElement4();
    }
    public static void findFirstNonRepeatingElement1(){
        List<Integer> list = Arrays.asList(4, 5,3, 1, 2, 1, 4, 5);
        Integer num = list.stream().filter(n -> Collections.frequency(list,n) == 1).findFirst().orElse(null);
        System.out.println(num);
    }
    public static void findFirstNonRepeatingElement2(){
        List<Integer> list = Arrays.asList(4, 5,3, 1, 2, 1, 4, 5);
//        Integer num = list.stream().distinct().filter(n -> Collections.frequency(list,n) == 1).findFirst().orElse(null);
        List<Integer> num = list.stream().filter(n -> list.indexOf(n) == list.lastIndexOf(n)).toList();
        Integer num2 = num.stream().findFirst().orElse(null);
        System.out.println(num2);
    }
    public static void findFirstNonRepeatingElement3(){
        String[] arr = {"apple", "banana", "apple", "orange", "banana", "grape"};
        List<String> list = Arrays.asList(arr);
//        Integer num = list.stream().distinct().filter(n -> Collections.frequency(list,n) == 1).findFirst().orElse(null);
        List<String> num = list.stream().filter(n -> list.indexOf(n) == list.lastIndexOf(n)).toList();
        String num2 = num.stream().skip(1).findFirst().orElse(null);
        System.out.println(num2);
    }
    public static void findFirstNonRepeatingElement4(){
        String[] arr = {"apple", "banana", "apple", "orange", "banana", "grape"};
        List<String> list = Arrays.asList(arr);
        String num2 = list.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                        .entrySet().stream().filter(n -> n.getValue() == 1).map(Map.Entry::getKey)
                        .findFirst().orElse(null);
        System.out.println(num2);
    }
}
