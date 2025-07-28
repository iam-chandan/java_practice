package OOPS.Encapsulation.CustomerWithConstructor;

public class Customer {
    private int customerId;
    private String customerName;
    private long customerMobileNo;

    public Customer(int customerId,String customerName,long customerMobileNo){
        this.customerId = customerId;
        this.customerName =  customerName;
        this.customerMobileNo = customerMobileNo;
    }

    public int getCustomerId(){
        return customerId;
    }

    public String getCustomerName(){
        return customerName;
    }

    public long getCustomerMobileNo(){
        return customerMobileNo;
    }
}
