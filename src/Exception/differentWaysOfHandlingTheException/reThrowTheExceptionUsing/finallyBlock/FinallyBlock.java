package Exception.differentWaysOfHandlingTheException.reThrowTheExceptionUsing.finallyBlock;

/*
                                        FINALLY BLOCK
-> Finally block is used to execute such statements which must compulsory execute with in method
   irrespective of an exception happen or not or critical lines are placed inside finally.
 */

import java.util.Scanner;

public class FinallyBlock {
    void fun(){
        System.out.println("connection established for FinallyBlock class");
        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("Enter the numerator :");
            int a = scn.nextInt();
            System.out.println("Enter the denominator :");
            int b = scn.nextInt();
            int c = a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("handled exception if FinallyBlock class fun()");
            throw e;
        }finally {
            System.out.println("connection is terminated");
        }
    }
}

class Driver{
    public static void main(String[] args) {
        System.out.println("connection 1 is established");
        FinallyBlock fb = new FinallyBlock();
        try {
            fb.fun();
        }catch (Exception e){
            System.out.println("Handled exception in main()");
        }
        System.out.println("connection 1 terminated");
    }
}

/*
connection 1 is established
connection established for FinallyBlock class
Enter the numerator :
100
Enter the denominator :
0
handled exception if FinallyBlock class fun()
connection is terminated
Handled exception in main()
connection 1 terminated
 */