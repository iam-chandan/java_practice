package OOPS.Abstraction.Shape;

import java.util.Scanner;

abstract class Shape {
    float area;
    abstract void acceptInput();
    abstract void calculateArea();
    void displayArea(){
        System.out.println(area);
    }
}

class Square extends Shape{
    float side;

    void acceptInput(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the side of square : ");
        side = scn.nextFloat();
    }

    void calculateArea(){
        area = side * side;
    }
}

class Rectangle extends Shape{
    float length;
    float breadth;

    void acceptInput(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of rectangle : ");
        length = scn.nextFloat();
        System.out.println("Enter the breadth of rectangle : ");
        breadth = scn.nextFloat();
    }

    void calculateArea(){
        area = length * breadth;
    }
}

class Circle extends Shape{
    float radius;

    void acceptInput(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        radius = scn.nextFloat();
    }

    void calculateArea(){
        area = 3.141f * radius * radius;
    }
}

class Geometry{
    void permit(Shape shape){
        shape.acceptInput();
        shape.calculateArea();
        shape.displayArea();
    }
}

class Driver{
    public static void main(String[] args) {
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        Geometry geometry = new Geometry();

        geometry.permit(square);
        geometry.permit(rectangle);
        geometry.permit(circle);
    }
}