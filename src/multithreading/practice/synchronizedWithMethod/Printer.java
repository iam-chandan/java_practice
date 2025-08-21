package multithreading.practice.synchronizedWithMethod;

/*
-> synchronized keyword will lock the thread and one thread after completed then only will going to enter another thread
 */

class Printer implements Runnable{
    synchronized public void run(){
        Thread t = Thread.currentThread();
        String name = t.getName();
        try {
            System.out.println(name + " accessed the printer.");
            Thread.sleep(4000);
            System.out.println(name + " is using printer.");
            Thread.sleep(4000);
            System.out.println(name + " finished using the printer.");
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class Driver{
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread t1 = new Thread(printer);
        Thread t2 = new Thread(printer);
        Thread t3 = new Thread(printer);

        t1.setName("BOY");
        t2.setName("GIRL");
        t3.setName("OTHER");

        t1.start();
        t2.start();
        t3.start();
    }
}
