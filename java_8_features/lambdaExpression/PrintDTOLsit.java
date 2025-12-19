package java_8_features.lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class PrintDTOLsit {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee(101,"abhijit",50000),
                new Employee(102,"swarna",42000),
                new Employee(103,"jintu",45000),
                new Employee(104,"abhisekh",60000));
        list.stream().map(emp -> new EmployeeDTO(emp.getId(), emp.getName())).forEach(System.out::println);
    }
}
