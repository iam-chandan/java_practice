package multithreading.practice.project;

public class Account implements Bank{
    private static int balance;
    private long accNum;

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    public static void deposit(int amount) {
        synchronized (Account.class){
            balance += amount;
            System.out.println("current balance : " + balance);
        }
    }

    public void withdraw(int amount){
        synchronized (this){
            if (balance >= amount){
                this.balance -= amount;
                System.out.println("current balance : " + balance);
            }else {
                System.out.println("you have low balance..");
            }
        }
    }
    @Override
    public synchronized void fundTransfer(int amount,String option,long accNum) {
        setAccNum(accNum);
        if(option.equals("add")){
            deposit(amount);
        }else if(option.equals("withdraw")){
            withdraw(amount);
        }else {
            System.out.println("Invalid option");
        }
    }
}
