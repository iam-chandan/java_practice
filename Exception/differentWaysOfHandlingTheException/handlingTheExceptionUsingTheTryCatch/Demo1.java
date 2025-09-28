package Exception.differentWaysOfHandlingTheException.handlingTheExceptionUsingTheTryCatch;

import java.util.Scanner;

/*
                        HANDLING THE EXCEPTION (TRY-CATCH)
-> Handling the exception inside the same method where exception occur known as handling
   the exception to handle this we use try-catch keyword.
 */
public class Demo1 {
    void fun(){
        try {
            System.out.println("Connection 2 is established");
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter the numerator :");
            int a = scn.nextInt();
            System.out.println("Enter the denominator :");
            int b = scn.nextInt();
            int c =  a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("Handled the exception in Demo1 class fun()");
        }
    }
}
class Driver{
    public static void main(String[] args) {
        System.out.println("connection 1 is established");
        Demo1 d1 = new Demo1();
        d1.fun();
        System.out.println("connection 1 is terminated");
    }
}

/*
Exception handled using try-catch :

connection 1 is established
Connection 2 is established
Enter the numerator :
100
Enter the denominator :
0
Handled the exception in Demo1 class fun()
connection 1 is terminated
 */