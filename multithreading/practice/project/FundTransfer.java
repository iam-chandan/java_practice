package multithreading.practice.project;

import java.util.Scanner;

public class FundTransfer extends Thread{
    private final Account account;

    public FundTransfer(Account account){
        this.account = account;
    }

    @Override
    public void run() {
        synchronized (FundTransfer.class){
            Scanner scn = new Scanner(System.in);

            System.out.println("current thread : " + Thread.currentThread().getName());

            System.out.println("Enter amount :");
            int amount = scn.nextInt();

            System.out.println("Enter account number :");
            long accNum = scn.nextLong();

            System.out.println("Enter option (add/withdraw):");
            String option = scn.next();

            account.fundTransfer(amount, option, accNum);
        }
    }
}
