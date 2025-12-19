package java_8_features.lambdaExpression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployee {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(101,"abhijit",50000),
                new Employee(102,"swarna",42000),
                new Employee(103,"jintu",45000),
                new Employee(104,"abhisekh",60000));
        System.out.println("sorted according to id ::::::::");
        list.stream().sorted((a,b)->a.getId()- b.getId()).forEach(System.out::println);

        System.out.println("\nsorted according to name ::::::::");
        list.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach(System.out::println);

        System.out.println("\nsorted according to salary ::::::::");
        list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);
    }
}
