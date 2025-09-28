package OOPS.Inheritance.ConstructorChaining.Customer;

public class Customer {
    private int customerId;
    private String customerName;
    private long customerMobile;
    private String customerAddress;

    public Customer(int customerId,String customerName,long customerMobile,String customerAddress){
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerMobile = customerMobile;
        this.customerAddress = customerAddress;
    }

    void display(){
        System.out.println("customer id : " + customerId);
        System.out.println("customer name : " + customerName);
        System.out.println("customer mobile no. : " + customerMobile);
        System.out.println("customer address : " + customerAddress);
    }
}
