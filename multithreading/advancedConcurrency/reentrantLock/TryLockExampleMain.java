package multithreading.advancedConcurrency.reentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class TryLockExample{
    private final ReentrantLock lock = new ReentrantLock();
    public void attemptTask(){
        try{
            if (lock.tryLock(2, TimeUnit.SECONDS)) {
                try {
                    System.out.println("Lock acquired, performing task");
                    Thread.sleep(2000);
                } finally {
                    lock.unlock();
                }
            }else {
                System.out.println("Couldn't acquire lock within 2 seconds , exiting...");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class TryLockExampleMain {
    public static void main(String[] args) {
        TryLockExample trying = new TryLockExample();
        Thread t1 = new Thread(trying::attemptTask);
        Thread t2 = new Thread(trying::attemptTask);

        t1.start();
        t2.start();
    }
}
