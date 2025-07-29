package OOPS.Constructor.CunstructorOverloading;

public class Customer {
    private int customerId;
    private String customerName;
    private long customerMobileNo;

    public Customer(){
        this.customerId = 101;
        this.customerName = "Arul";
        this.customerMobileNo = 8574123690l;
    }

    public Customer(int customerId,String customerName,long customerMobileNo){
        this.customerId = customerId;
        this.customerName = customerName;
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
