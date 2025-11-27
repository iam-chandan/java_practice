package multithreading.practice.project;

public class SyncgonizedExmp {
    public static void main(String[] args) {
        Account account = new Account();

        FundTransfer ft1 = new FundTransfer(account);
        ft1.setName("ft1");
        ft1.start();

        FundTransfer ft2 = new FundTransfer(account);
        ft2.setName("ft2");
        ft2.start();
    }
}
