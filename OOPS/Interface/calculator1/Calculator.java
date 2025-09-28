package OOPS.Interface.calculator1;

import java.util.Scanner;

public interface Calculator {
    void add();
    void subtract();
}

class MyCalculator1 implements Calculator{
    public void add(){
        int a = 200;
        int b = 100;
        System.out.println(a + b);
    }
    public void subtract(){
        int a = 200;
        int b = 100;
        System.out.println(a - b);
    }
}

class MyCalculator2 implements Calculator{
    Scanner scn = new Scanner(System.in);
    public void add(){
        System.out.println("Enter 1st number : ");
        int a = scn.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = scn.nextInt();
        System.out.println(a + b);
    }
    public void subtract(){
        System.out.println("Enter 1st number : ");
        int a = scn.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = scn.nextInt();
        System.out.println(a - b);
    }
}

class MyCalculator3 implements Calculator{
    Scanner scn = new Scanner(System.in);
    public void add(){
        System.out.println("Enter 1st number : ");
        int a = scn.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = scn.nextInt();

        if(a <= 0){
            System.out.println("Enter a valid number it should not zero or negative.");
        }else {
            System.out.println(a + b);
        }
    }
    public void subtract(){
        System.out.println("Enter 1st number : ");
        int a = scn.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = scn.nextInt();

        if(a <= 0){
            System.out.println("Enter a valid number it should be not zero or negative.");
        }else {
            System.out.println(a - b);
        }
    }

}
class Math{
    static void permit(Calculator calculator){
        calculator.add();
        calculator.subtract();
    }
}

class Driver{
    public static void main(String[] args) {
        MyCalculator1 mc1 = new MyCalculator1();
        MyCalculator2 mc2 =  new MyCalculator2();
        MyCalculator3 mc3 = new MyCalculator3();

        Math.permit(mc1);
        Math.permit(mc2);
        Math.permit(mc3);
    }
}