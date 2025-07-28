package OOPS.Encapsulation.BankAccount;

public class Driver {
    public static void main(String[] args){
        BankAccount ba = new BankAccount();

        ba.setData(10000000000l);

        System.out.println(ba.getData());
    }
}
