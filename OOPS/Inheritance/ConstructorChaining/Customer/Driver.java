package OOPS.Inheritance.ConstructorChaining.Customer;

public class Driver {
    public static void main(String[] args) {
        RegularCustomer rc = new RegularCustomer(101,"Rohit",7854236915l,"Bangalore",7);
        rc.display();
        rc.getDiscount();
    }
}
