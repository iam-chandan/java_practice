package OOPS.Interface.functionalInterface;

public class Driver{
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.pay();
        sbi.getBankDetails();
        Bank.offerLoan(); // static method
    }
}
