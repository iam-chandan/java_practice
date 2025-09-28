package Exception.normalFlowUsingTryCatch;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Connection Estd");
        Scanner scn = new Scanner(System.in);
        try{
            System.out.println("Enter first element :");
            int a = scn.nextInt();
            System.out.println("Enter second element :");
            int b = scn.nextInt();
            int c = a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("denominator should not be smaller than 1 it should be greater than 1.");
        }
        System.out.println("Connection terminated");
    }
}
/*
user defined exception handler :
Connection Estd
Enter first element :
100
Enter second element :
0
denominator should not be smaller than 1 it should be greater than 1.
Connection terminated
 */