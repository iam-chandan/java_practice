package OOPS.Constructor.SuperKeyword;

public class Test1 {
    int i = 10;
}
class Test2 extends Test1{
    int i = 20;
    void display(){
        System.out.println(i);
        System.out.println(super.i);
    }
}

class Driver{
    public static void main(String[] args) {
        Test2 t2 = new Test2();
        t2.display();
    }
}
