package Exception.differentWaysOfHandlingTheException.duckingAnException;

import java.util.Scanner;

/*
                                    DUCKING AN EXCEPTION
-> Ducking an exception means letting a method pass the responsibility of handling the exception
   to the calling method by using the 'throws' keyword in the method signature. this way the method
   doesn't handle the exception itself.it ducks it and lets the caller deal with it.
 */

public class Ducking {
    void fun() throws Exception{
        System.out.println("connection 2 is established");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the numerator :");
        int a = scn.nextInt();
        System.out.println("Enter the denominator :");
        int b = scn.nextInt();
        int c = a/b;
        System.out.println(c);
        System.out.println("connection 2 is terminated");
    }
}

class Driver{
    public static void main(String[] args) {
        System.out.println("connection 1 is established");
        Ducking ducking =  new Ducking();
        try {
            ducking.fun();
        }catch (Exception e){
            System.out.println("Handled exception inside main()");
        }
        System.out.println("connection 1 is terminated");
    }
}

/*
public static void main(String[] args) {
    System.out.println("connection 1 is established");
    Ducking ducking =  new Ducking();
    ducking.fun(); -> after using throws if we call like this then it will show error so try to call this in try catch
    System.out.println("connection 1 is terminated");
}
 */


/*
public static void main(String[] args) {
    System.out.println("connection 1 is established");
    Ducking ducking =  new Ducking();
    try {
        ducking.fun();
    }catch (Exception e){
        System.out.println("Handled exception inside main()");
    }
    System.out.println("connection 1 is terminated");
}

connection 1 is established
connection 2 is established
Enter the numerator :
100
Enter the denominator :
0
Handled exception inside main()
connection 1 is terminated
 */