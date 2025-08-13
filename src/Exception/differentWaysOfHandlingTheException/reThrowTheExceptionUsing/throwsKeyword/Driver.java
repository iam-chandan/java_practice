package Exception.differentWaysOfHandlingTheException.reThrowTheExceptionUsing.throwsKeyword;

import java.util.Scanner;

/*
                        throws keyword
-> When ever you are rethrowing an exception it is very important that the method which is throwing
   the signature warns the caller that may throw an exception to do that we use throws keyword.
 */

class Demo{
    void fun() throws Exception{
        System.out.println("connection 2 is established");
        Scanner scn = new Scanner(System.in);
        try{
            System.out.println("Enter the numerator :");
            int a = scn.nextInt();
            System.out.println("Enter the denominator :");
            int b = scn.nextInt();
            int c = a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("Handled inside fun()");
            throw e;
        }finally {
            System.out.println("connection 2 is terminated");
        }

    }
}

public class Driver {
    public static void main(String[] args) {
        System.out.println("connection 1 is established");
        Demo d = new Demo();
        try {
            d.fun();
        }catch (Exception e){
            System.out.println("Handled inside main()");
        }
        System.out.println("connection 1 is terminated");
    }
}

/*
connection 1 is established
connection 2 is established
Enter the numerator :
100
Enter the denominator :
0
Handled inside fun()
connection 2 is terminated
Handled inside main()
connection 1 is terminated
 */