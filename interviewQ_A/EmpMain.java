package interviewQ_A;

import java.util.*; // Importing utility classes
import java.util.stream.*; // Importing Stream API

// interviewQ_A.Employee class
class Employee {
    String name;      // interviewQ_A.Employee name
    double salary;    // interviewQ_A.Employee salary

    // Constructor to initialize employee object
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }
}
public class EmpMain {
    public static List<String> filterEmployeesBySalary(List<Employee> employees, double salaryThreshold) {

        // Handle null list case
        if (employees == null) {
            return Collections.emptyList(); // return empty list if input is null
        }

        return employees.stream()
                .filter(Objects::nonNull) // remove null employee objects
                .filter(emp -> emp.getSalary() > salaryThreshold) // filter salary greater than threshold
                .map(Employee::getName) // extract employee names
                .collect(Collectors.toList()); // collect into list
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Creating sample employee list
        int n = input.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Employee e = new Employee(input.next(), input.nextDouble());
            employees.add(e);
        }

//        employees = Arrays.asList(
//                new interviewQ_A.Employee("Alice", 75000),
//                new interviewQ_A.Employee("Bob", 60000),
//                new interviewQ_A.Employee("Charlie", 80000),
//                new interviewQ_A.Employee("David", 50000)
//        );

        double salaryThreshold = 65000; // threshold value

        // Calling method
        List<String> result = filterEmployeesBySalary(employees, salaryThreshold);

        // Printing result
        System.out.println(result); // Output: [Alice, Charlie]
    }
}
