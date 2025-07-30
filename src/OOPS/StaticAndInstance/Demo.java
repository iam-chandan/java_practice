package OOPS.StaticAndInstance;

public class Demo {
    static int a,b;

    static {
        System.out.println("Inside static block");
        a = 10;
        b = 20;
    }

    static void fun1(){
        System.out.println("Inside static method : a = " + a + " b = " + b);
    }

    int x,y;

    {
        System.out.println("Inside instance block");
    }

    void fun2(int x,int y){
        this.x = x;
        this.y = y;
        System.out.println("Inside instance method : x = " + x + " y = " + y);
    }

    Demo(){
        System.out.println("Inside constructor");
        x = 30;
        y = 40;
    }
}
