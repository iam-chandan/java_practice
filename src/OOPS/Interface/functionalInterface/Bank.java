package OOPS.Interface.functionalInterface;


/*
   inside functional README.md only one abstract method is allowed but any number of default method,private method
   and static method allowed
*/

@FunctionalInterface
public interface Bank {
    void pay();

    // default method optional to override
    default void getBankDetails(){
        longTransaction();
        System.out.println(privateStaticInfo());
    }

    // private method introduced in java 9
    private void longTransaction(){
        System.out.println("transaction log created");
    }

    // private static method introduced in java 9
    private static String privateStaticInfo(){
        return "Confidential Bank Info (private static method)";
    }

    //static method introduced in java 8
    static void offerLoan(){
        System.out.println("Bank offers 6% interest loan.");
    }
}
class SBI implements Bank{
    @Override
    public void pay() {
        System.out.println("payment done successfully using SBI online banking");
    }
}

