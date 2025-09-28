package OOPS.Inheritance.Rule1;

/**
 * RULE : 1:-
 * private members do not participate in inheritance. whereas default, protected, public members of class participate
 * in inheritance. if we allow private members for inheritance then it affect "Encapsulation".
 */
class Demo1{
    private int a = 100;
    int b = 200;
    void fun1(){
        System.out.println("JAVA");
    }
}
class Demo2 extends Demo1{
    int c = 300;
    void fun2(){
        System.out.println("PYTHON");
    }

    void display(){
       // System.out.println(a); //here i am accessing private member of Demo1 class so it will give compilation error without this 'a' variable i can get out put
        System.out.println(b);
        System.out.println(c);
    }
}

public class Driver {
    public static void main(String[] args) {
        Demo2 d2 = new Demo2();
        d2.display();
        d2.fun2();
        d2.fun1();
    }
}
