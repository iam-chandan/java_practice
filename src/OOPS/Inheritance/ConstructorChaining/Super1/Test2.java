package OOPS.Inheritance.ConstructorChaining.Super1;

public class Test2 extends Test1{
    int a;
    int b;
    public Test2(){
        a = 300;
        b = 400;
    }

    public Test2(int a,int b){
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
