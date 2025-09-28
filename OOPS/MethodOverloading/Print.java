package OOPS.MethodOverloading;
/*
Method Overloading :
in java method overloading means in a class if more than one method with same name and different parameters
that is known as method overloading.
 */
public class Print {
    void print(int a){
        System.out.println(a);
    }
    void print(int a,int b){
        System.out.println(a + " + " + b + " : " + (a+b));
    }
    void print(int a,float b){
        System.out.println(a + " + " + b + " : " + (a+b));
    }

    public static void main(String[] args) {
        Print p = new Print();
        p.print(12);
        p.print(12,13);
        p.print(15,13.6f);
    }
}
