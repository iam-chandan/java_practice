package multithreading.threadState;

/*
-> interrupt() will kill or interrupt the current thread and go the dead stage and give the interrupt exception.
 */

public class InterruptMethod {
    public static void main(String[] args) {
        System.out.println("main thread started");
        try {
            System.out.println("main thread executing..");
            Thread.sleep(4000);
            System.out.println("main thread executing..");
            Thread.sleep(4000);
            System.out.println("main thread executing..");
            Thread.sleep(4000);
            System.out.println("main thread executing..");
            Thread.currentThread().interrupt();
            Thread.sleep(4000);
            System.out.println("main thread executing..");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main thread ended");
    }
}
