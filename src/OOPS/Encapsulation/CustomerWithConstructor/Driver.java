package OOPS.Encapsulation.CustomerWithConstructor;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        Customer cust  = new Customer(scn.nextInt(),scn.next(),scn.nextLong());

        System.out.println(cust.getCustomerId() + " " + cust.getCustomerName() + " " + cust.getCustomerMobileNo());
    }
}
