package Exception.propogationOfExceptionObject;

import java.util.Scanner;

/*
                PROPAGATION OF EXCEPTION OBJECT
-> Propagation of exception object in java means how the exception
   travels from one method to another in the call stack until it is
   handled
 */

/*
                                STACK TRACE
-> If an Exception happens within a method if the method doesn't handle
   that exception then the Runtime System(RTS) doesn't directly propagate
   exception object to the default exception handler instead it will propagated
   down the stack hierarchy and if non of the methods in the stack hierarchy
   handled the exception then only it will reach to default exception handler
   that is known as stack trace.
 */

public class Demo1 {
    void fun4() {
        System.out.println("connection 4 is established");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the numerator : ");
        int a = scn.nextInt();
        System.out.println("Enter the denominator :");
        int b = scn.nextInt();
        int c = a / b;
        System.out.println(c);
        System.out.println("Handle the exception in fun4()");
        System.out.println("connection 4 is terminated");
    }
}

class Demo2 {
    void fun3() {
        System.out.println("connection 3 is established");
        Demo1 d1 = new Demo1();
        try{
            d1.fun4();
        }catch (Exception e){
            System.out.println("Handle the exception in fun3()");
        }
        System.out.println("connection 3 is terminated");
    }
}

class Demo3 {
    void fun2() {
        System.out.println("connection 2 is established");
        Demo2 d2 = new Demo2();
        d2.fun3();
        System.out.println("connection 2 is terminated");
    }
}

class Driver {
    public static void main(String[] args) {
        System.out.println("connection 1 is established");
        Demo3 d3 = new Demo3();
        d3.fun2();
        System.out.println("connection 1 is terminated");
    }
}

/*
with out exception handle:-

connection 1 is established
connection 2 is established
connection 3 is established
connection 4 is established
Enter the numerator :
100
Enter the denominator :
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Exception.propogationOfExceptionObject.Demo1.fun4(Demo1.java:13)
	at Exception.propogationOfExceptionObject.Demo2.fun3(Demo1.java:23)
	at Exception.propogationOfExceptionObject.Demo3.fun2(Demo1.java:32)
	at Exception.propogationOfExceptionObject.Driver.main(Demo1.java:41)
 */

/*
exception handled in fun4():-

void fun4(){
    System.out.println("connection 4 is established");
    Scanner scn = new Scanner(System.in);
    try {
        System.out.println("Enter the numerator : ");
        int a = scn.nextInt();
        System.out.println("Enter the denominator :");
        int b =  scn.nextInt();
        int c =  a/b;
        System.out.println(c);
    }catch (Exception e){
        System.out.println("Handle the exception in fun4()");
    }
    System.out.println("connection 4 is terminated");
}

connection 1 is established
connection 2 is established
connection 3 is established
connection 4 is established
Enter the numerator :
100
Enter the denominator :
0
Handle the exception in fun4()
connection 4 is terminated
connection 3 is terminated
connection 2 is terminated
connection 1 is terminated
 */

/*
exception handled in fun3():-
void fun3() {
    System.out.println("connection 3 is established");
    Demo1 d1 = new Demo1();
    try{
        d1.fun4();
    }catch (Exception e){
        System.out.println("Handle the exception in fun3()");
    }
    System.out.println("connection 3 is terminated");
}

connection 1 is established
connection 2 is established
connection 3 is established
connection 4 is established
Enter the numerator :
100
Enter the denominator :
0
Handle the exception in fun3()
connection 3 is terminated
connection 2 is terminated
connection 1 is terminated

-> Here connection 4 is not terminated
 */