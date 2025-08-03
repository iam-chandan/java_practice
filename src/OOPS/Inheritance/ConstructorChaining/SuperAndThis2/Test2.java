package OOPS.Inheritance.ConstructorChaining.SuperAndThis2;

public class Test2 extends Test1 {
    int a,b;

    Test2(){
        this(9,99);
        a = 300;
        b = 400;
    }

    Test2(int a,int b){
        super(a,b);
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
