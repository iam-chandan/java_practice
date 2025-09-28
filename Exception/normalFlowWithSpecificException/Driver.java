package Exception.normalFlowWithSpecificException;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Specific catch block:-
-> it is used for specific exception with like ArithmeticException,IOException not like generic Exception which will take
all kind of exception not specific
-> after all specific exception in the last you should add generic exception so that other you expected exception if
any other exception come then generic exception will handle.
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println("Connection is Estd.");
        Scanner scn = new Scanner(System.in);
        try{
            System.out.println("Enter the numerator :");
            int a = scn.nextInt();
            System.out.println("Enter the denominator :");
            int b = scn.nextInt();
            int c = a/b;
            System.out.println(c);
            System.out.println("Enter the size of array :");
            int size = scn.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the element to be stored :");
            int ele = scn.nextInt();
            System.out.println("Enter the index at which the element must be stored :");
            int index = scn.nextInt();
            arr = null;
            arr[index] = ele;
            System.out.println(arr[index]);
        }catch (ArithmeticException ae){
            System.out.println("Enter non-zero denominator");
        }catch (NegativeArraySizeException nae){
            System.out.println("Enter a positive size");
        }catch (InputMismatchException ime){
            System.out.println("Enter valid input");
        }catch (ArrayIndexOutOfBoundsException aiobe){
            System.out.println("Enter the index with in limit");
        }catch (Exception e){
            System.out.println("Invalid Input");
        }
        System.out.println("Connection is terminated");
    }
}
/*
ArithmeticException :-

Connection is Estd.
Enter the numerator :
100
Enter the denominator :
0
Enter non-zero denominator
Connection is terminated
 */

/*
NegativeArraySizeException :-

Connection is Estd.
Enter the numerator :
100
Enter the denominator :
2
50
Enter the size of array :
-4
Enter a positive size
Connection is terminated
 */

/*
InputMismatchException :-

Connection is Estd.
Enter the numerator :
100
Enter the denominator :
2
50
Enter the size of array :
5
Enter the element to be stored :
hbvhbj
Enter valid input
Connection is terminated
 */

/*
ArrayIndexOutOfBoundsException :-

Connection is Estd.
Enter the numerator :
100
Enter the denominator :
2
50
Enter the size of array :
5
Enter the element to be stored :
12
Enter the index at which the element must be stored :
6
Enter the index with in limit
Connection is terminated
 */

/*
Exception :-

Connection is Estd.
Enter the numerator :
100
Enter the denominator :
2
50
Enter the size of array :
5
Enter the element to be stored :
12
Enter the index at which the element must be stored :
2
Invalid Input
Connection is terminated
 */