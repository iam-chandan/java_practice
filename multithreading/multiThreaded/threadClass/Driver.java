package multithreading.multiThreaded.threadClass;

import java.util.Scanner;

class Addition extends Thread{
    public void run(){
        System.out.println("Addition started");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first element :");
        int a = scn.nextInt();
        System.out.println("Enter second element :");
        int b = scn.nextInt();
        int c = a + b;
        System.out.println(c);
        System.out.println("Addition ended");
    }
}

class PrintChar extends Thread{
    public void run(){
        System.out.println("printing character started");
        for (int i = 65; i <= 75; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(4000);
            }catch (Exception e){
                System.out.println("some problem occur");
            }
        }
        System.out.println("printing character ended");
    }
}

class PrintNum extends Thread{
    public void run(){
        System.out.println("printing number started");
        for (int i = 10; i <= 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(4000);
            }catch (Exception e){
                System.out.println("some problem occur");
            }
        }
    }
}

public class Driver {
    public static void main(String[] args) {
        Addition addition = new Addition();
        PrintChar printChar = new PrintChar();
        PrintNum printNum = new PrintNum();

//        Thread th1 = new Thread(addition);
//        Thread th2 = new Thread(printChar);
//        Thread th3 = new Thread(printNum);
        addition.start();
        printChar.start();
        printNum.start();

    }
}
