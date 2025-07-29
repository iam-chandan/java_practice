package OOPS.Constructor.CunstructorOverloading;

public class Driver {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println(customer.getCustomerId() + " " + customer.getCustomerName() + " " + customer.getCustomerMobileNo());

        Customer customer1 = new Customer(102,"Megha",8547123690l);
        System.out.println(customer1.getCustomerId() + " " + customer1.getCustomerName() + " " + customer1.getCustomerMobileNo());
    }
}
