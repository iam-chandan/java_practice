package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {
        List<Employee>  list = Arrays.asList(new Employee(101,"abhijit",50000,"it",28),
                new Employee(102,"swarna",45000,"qa",30),
                new Employee(101,"jintu",40000,"it",27),
                new Employee(101,"chandan",45000,"it",28));
        Map<String,List<Employee>> map = list.stream().collect(Collectors.groupingBy(s -> s.getDepartment()));
        System.out.println(map);

        Map<Integer,List<Employee>> id = list.stream().collect(Collectors.groupingBy(i -> i.getAge()));
        System.out.println("\n"+id);
    }
}
