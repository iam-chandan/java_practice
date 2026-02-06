package collections.map.hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Employee{
    String name;
    Employee(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class MutationExample {
    public static void main(String[] args) {
        Map<Employee,String> map = new HashMap<>();
        Employee e1 = new Employee("chandan");
        Employee e2 = new Employee("nikhil");
        Employee e3 = new Employee("tusar");
        map.put(e1,"SSE");
        map.put(e2,"tech lead");
        map.put(e3,"manager");
        System.out.println(map);
//        map.put(e3.name = "chandan");
        System.out.println(map);
    }
}
