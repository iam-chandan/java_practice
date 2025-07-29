package OOPS.Encapsulation.BankAccount;

public class BankAccount {
    private long balance;

    public void setData(long amount){
        if (amount > 0){
            balance = amount;
        }else {
            System.out.println("Invalid Amount");
            System.exit(0);
        }
    }
    public long getData(){
        return balance;
    }
}
