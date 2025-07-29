package OOPS.Constructor.DefautConstructor;

public class Driver {
    public static void main(String[] args) {
        Customer customer = new Customer();

        System.out.println(customer.getCustomerId() + " " + customer.getCustomerName() + " " + customer.getCustomerMobileNo());
    }
}
