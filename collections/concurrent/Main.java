package collections.concurrent;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;
class ZeroOddEven{
    private int n;
    private Semaphore zeroSemaphore;
    private Semaphore oddSemaphore;
    private Semaphore evanSemaphore;

    public ZeroOddEven(int n){
        this.n = n;
        zeroSemaphore = new Semaphore(1);
        oddSemaphore = new Semaphore(0);
        evanSemaphore = new Semaphore(0);
    }
    public void zero(IntConsumer printNumber) throws InterruptedException{
        boolean isOdd = true;
        for (int i = 1; i <= n; i++) {
            zeroSemaphore.acquire();
            printNumber.accept(0);
            if (isOdd){
                oddSemaphore.release();
            }else {
                evanSemaphore.release();
            }
            isOdd = !isOdd;
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException{
        for (int i = 1; i <= n; i += 2) {
            oddSemaphore.acquire();
            printNumber.accept(i);
            zeroSemaphore.release();
        }
    }
    public void even(IntConsumer printNumber) throws InterruptedException{
        for (int i = 2; i <= n; i += 2) {
            evanSemaphore.acquire();
            printNumber.accept(i);
            zeroSemaphore.release();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int n = 5;
        ZeroOddEven zeroOddEven = new ZeroOddEven(n);
        IntConsumer printer = num -> System.out.print(num);

        Thread t1 = new Thread(()->{
            try{
                zeroOddEven.zero(printer);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t2 = new Thread(()->{
            try {
                zeroOddEven.odd(printer);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t3 = new Thread(()->{
            try {
                zeroOddEven.even(printer);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
