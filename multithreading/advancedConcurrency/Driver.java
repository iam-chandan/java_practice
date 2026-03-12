package multithreading.advancedConcurrency;
class Shared{
    int num;
    boolean flag = false;
    public synchronized void produce(int n) throws InterruptedException {
        while (flag){
            wait();
        }
        num = n;
        System.out.println("Produced number " + num);
        flag = true;
        notify();
    }

    public synchronized void consume(int n) throws InterruptedException {
        while (!flag){
            wait();
        }
        num = n;
        System.out.println("Consumed number " + num);
        flag = false;
        notify();
    }
}

public class Driver {
    public static void main(String[] args) {
        Shared share = new Shared();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    share.produce(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    share.consume(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
