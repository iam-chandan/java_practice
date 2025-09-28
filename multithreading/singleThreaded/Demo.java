package multithreading.singleThreaded;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception{
        System.out.println("Addition started");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = scn.nextInt();
        System.out.println("Enter second number :");
        int b = scn.nextInt();
        int c = a + b;
        System.out.println(c);
        System.out.println("Addition ended");

        System.out.println("Printing characters started");
        for (int i = 65; i <= 75; i++) {
            System.out.println((char) i);
            Thread.sleep(4000);
        }
        System.out.println("Printing characters ended");

        System.out.println("Printing numbers started");
        for (int i = 10; i <= 20; i++) {
            System.out.println(i);
            Thread.sleep(4000);
        }
        System.out.println("Printing numbers ended");
    }
}
