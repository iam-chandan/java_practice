package OOPS.Inheritance.Rule2;

/**
 * RULE : 2 :-
 * Multilevel Inheritance is allowed in JAVA.
 *
 */
class Demo1{
    int a = 100;
    void fun1(){
        System.out.println("JAVA");
    }
}
class Demo2 extends Demo1{
    int b = 200;
    void fun2(){
        System.out.println("PYTHON");
    }
}

class Demo3 extends Demo2{
    int c = 300;
    void fun3(){
        System.out.println("JAVASCRIPT");
    }

    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

public class Driver {
    public static void main(String[] args) {
        Demo3 d3 = new Demo3();

        d3.display();
        d3.fun1();
        d3.fun2();
        d3.fun3();
    }
}
