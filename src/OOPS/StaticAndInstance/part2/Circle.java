package OOPS.StaticAndInstance.part2;

import java.util.Scanner;

public class Circle {
    static private float pi;
    private float r;
    private float area;

    static {
        pi = 3.1415f;
    }

    public void acceptInput(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        r = scn.nextFloat();
    }

    public void area(){
        area = pi * r * r;
    }

    public void displayArea(){
        System.out.println("Area is : " + area);
    }
}
