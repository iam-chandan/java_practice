package multithreading.practice.synchronizedBlock;

public class Printer implements Runnable{
    public void run(){
        String name = Thread.currentThread().getName();
        try{
            System.out.println(name + " 1st line is printed");
            Thread.sleep(2000);
            System.out.println(name + " 2nd line is printed");
            Thread.sleep(2000);
            System.out.println(name + " 3rd line is printed");
            Thread.sleep(2000);
            synchronized (this){
                System.out.println(name + " 4th line is printed");
                Thread.sleep(2000);
                System.out.println(name + " 5th line is printed");
                Thread.sleep(2000);
                System.out.println(name + " 6th line is printed");
                Thread.sleep(2000);
                System.out.println(name + " 7th line is printed");
                Thread.sleep(2000);
            }
            System.out.println(name + " 8th line is printed");
            Thread.sleep(2000);
            System.out.println(name + " 9th line is printed");
            Thread.sleep(2000);
            System.out.println(name + " 10th line is printed");
            Thread.sleep(2000);
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