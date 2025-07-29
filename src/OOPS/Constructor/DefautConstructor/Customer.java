package OOPS.Constructor.DefautConstructor;

public class Customer {
    private int customerId;
    private String customerName;
    private long customerMobileNo;

    public Customer(){
        this.customerId = 101;
        this.customerName = "Arul";
        this.customerMobileNo = 8475693558L;
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
