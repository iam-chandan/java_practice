package solid.open_closed_principle;
/*
                                   Open/Closed Principle
 This principle states that Software entities (classes, modules, functions, etc.) should be open for extension,
 but closed for modification which means you should be able to extend a class behavior, without modifying it.
 */
abstract class Shape{
    public abstract double calculateArea();
}
class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    @Override
    public double calculateArea() {
        return width*height;
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
}

class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double calculateArea() {
        return a*b*c;
    }
}
public class AreaCalculation {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(2,3,4);
        double rectangleArea = rectangle.calculateArea();
        System.out.println(rectangleArea);
        double circleArea = circle.calculateArea();
        System.out.println(circleArea);
        double triangleArea = triangle.calculateArea();
        System.out.println(triangleArea);
    }
}
