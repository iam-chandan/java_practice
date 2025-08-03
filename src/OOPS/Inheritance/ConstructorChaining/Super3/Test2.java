package OOPS.Inheritance.ConstructorChaining.Super3;

public class Test2 extends Test1{
    int a,b;

    Test2(){
        a = 300;
        b = 400;
    }

    Test2(int x,int y,int a,int b){
        super(x,y);
        this.a = a;
        this.b = b;
    }

    void display(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}
