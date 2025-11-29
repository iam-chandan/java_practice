package java_8_features.lambdaExpression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


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
