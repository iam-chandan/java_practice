package OOPS.Encapsulation.CustomerWithoutConstructor;

public class Driver {
    public static void main(String[] args){
        Customer cust = new Customer();
        cust.setData(101,"Arul",8457963215l);
        System.out.println(cust.getCustomerId() + " " + cust.getCustomerName() + " " + cust.getCustomerMobileNo());
    }
}
