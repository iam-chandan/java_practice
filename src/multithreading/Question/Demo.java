package multithreading.Question;

import java.util.Scanner;

/*
Q. Is there anyway to achieve multithreading instead using multiple run methods and multiple classes can you have
   single run() method or single class & achieve multithreading.
 */
public class Demo extends Thread{
    public void run(){
        Thread t = Thread.currentThread();
        String name = t.getName();
        if (name.equals("ADD")){
            addition();
        } else if (name.equals("CHAR")) {
            printChar();
        }else {
            printNum();
        }
    }
    public void addition(){
        System.out.println("addition started");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = scn.nextInt();
        System.out.println("Enter second number :");
        int b = scn.nextInt();
        int c = a + b;
        System.out.println(c);
        System.out.println("addition ended");
    }

    public void printChar(){
        System.out.println("printing character started");
        for (int i = 65; i <= 75; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(4000);
            }catch (Exception e){
                System.out.println("Exception occurred");
            }
        }
        System.out.println("printing character ended");
    }

    public void printNum(){
        System.out.println("printing number started");
        for (int i = 10; i <= 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(4000);
            }catch (Exception e){
                System.out.println("Exception occurred");
            }
        }
        System.out.println("printing number ended");
    }
}
class Driver{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();

        d1.setName("ADD");
        d2.setName("CHAR");
        d3.setName("NUM");

        d1.start();
        d2.start();
        d3.start();
    }
}