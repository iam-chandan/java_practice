package OOPS.Inheritance.Rule3;

/**
 * RULE : 3 :-
 * Multiple Inheritance is not allowed in JAVA.
 * -> With multiple Inheritance Diamond shape problem happen
 */

class Demo1{
    int a = 9;
    void fun1(){
        System.out.println("JAVA");
    }
}
class Demo2{
    int b = 99;
    void fun2(){
        System.out.println("PYTHON");
    }
}
//class Demo3 extends Demo1,Demo2{ // here i am doing multiple inheritance but not multilevel inheritance bcz of that it will give error
//    int c = 300;
//    void fun3(){
//        System.out.println("JAVASCRIPT");
//    }
//    void display(){
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//    }
//}

//public class Driver {
//    public static void main(String[] args) {
//        Demo3 d3 = new Demo3();
//
//        d3.display();
//        d3.fun1();
//        d3.fun2();
//        d3.fun3();
//    }
//}
