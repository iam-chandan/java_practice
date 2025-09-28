package Exception.normalFlow;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Connection Estd.");
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter first element : ");
        int a = scn.nextInt();
        System.out.println("Enter second element :");
        int b = scn.nextInt();
        int c =  a/b;
        System.out.println(c);
        System.out.println("Connection terminated");
    }
}

/*
 Normal termination o/p:
 Connection Estd.
 Enter first element :
 100
 Enter second element :
 5
 20
 Connection terminated
* */

/*
Abrupt terminate :

Connection Estd.
Enter first element :
100
Enter second element :
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Exception.normalFlow.Driver.main(Driver.java:14)
 */