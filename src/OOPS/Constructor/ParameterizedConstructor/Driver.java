package OOPS.Constructor.ParameterizedConstructor;

public class Driver {
    public static void main(String[] args) {
        Customer customer = new Customer(102,"Megha",8574963210l);
        System.out.println(customer.getCustomerId() + " " + customer.getCustomerName() + " " + customer.getCustomerMobileNo());
    }
}
