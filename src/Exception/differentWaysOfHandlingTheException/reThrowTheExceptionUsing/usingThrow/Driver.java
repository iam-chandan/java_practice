package Exception.differentWaysOfHandlingTheException.reThrowTheExceptionUsing.usingThrow;

import java.util.Scanner;
/*
                    throw keyword
-> throw keyword returns the exception object from where the method is called.
-> Disadvantage of throw keyword is statements below the throw keyword will not automatically get
   executed because the moment JVM will see the throw keyword then the control will go outside the
   method along with exception object.
 */
class Demo{
    void fun(){
        System.out.println("connection 2 is established");
        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("Enter the numerator :");
            int a = scn.nextInt();
            System.out.println("Enter the denominator :");
            int b = scn.nextInt();
            int c = a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("Handled exception in Demo class and fun()");
            throw e;
        }
        System.out.println("connection is terminated");
    }
}

public class Driver {
    public static void main(String[] args) {
        System.out.println("connection 1 is established");
        Demo d = new Demo();
        try{
            d.fun();
        }catch (Exception e){
            System.out.println("handled exception in main()");
        }
        System.out.println("connection is terminated");
    }
}
/**********************************************************************************/
/*
class Demo{
    void fun(){
        System.out.println("connection 2 is established");
        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("Enter the numerator :");
            int a = scn.nextInt();
            System.out.println("Enter the denominator :");
            int b = scn.nextInt();
            int c = a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("Handled exception in Demo class and fun()");
            throw e;
        }
        System.out.println("connection is terminated");
    }
}

public class Driver {
    public static void main(String[] args) {
        System.out.println("connection 1 is established");
        Demo d = new Demo();
        d.fun();
        System.out.println("connection is terminated");
    }
}

connection 1 is established
connection 2 is established
Enter the numerator :
100
Enter the denominator :
0
Handled exception in Demo class and fun()
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Exception.differentWaysOfHandlingTheException.reThrowTheExceptionUsing.usingThrow.Demo.fun(Driver.java:14)
	at Exception.differentWaysOfHandlingTheException.reThrowTheExceptionUsing.usingThrow.Driver.main(Driver.java:28)
 */
/********************************************************************************************************************/
/*
class Demo{
    void fun(){
        System.out.println("connection 2 is established");
        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("Enter the numerator :");
            int a = scn.nextInt();
            System.out.println("Enter the denominator :");
            int b = scn.nextInt();
            int c = a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("Handled exception in Demo class and fun()");
            throw e;
        }
        System.out.println("connection is terminated");
    }
}

public class Driver {
    public static void main(String[] args) {
        System.out.println("connection 1 is established");
        Demo d = new Demo();
        try{
            d.fun();
        }catch (Exception e){
            System.out.println("handled exception in main()");
        }
        System.out.println("connection is terminated");
    }
}

connection 1 is established
connection 2 is established
Enter the numerator :
100
Enter the denominator :
0
Handled exception in Demo class and fun()
handled exception in main()
connection is terminated

-> here connection 1 is not terminated to handle this we use finally block
 */