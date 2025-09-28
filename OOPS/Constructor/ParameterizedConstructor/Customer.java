package OOPS.Constructor.ParameterizedConstructor;

public class Customer {
    private int customerId;
    private String customerName;
    private long customerMobileNo;

    public Customer(int _customerId,String _customerName,long _customerMobileNo){
        this.customerId = _customerId;
        this.customerName = _customerName;
        this.customerMobileNo = _customerMobileNo;
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
