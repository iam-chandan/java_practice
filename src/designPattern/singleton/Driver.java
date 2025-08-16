package designPattern.singleton;

/*
                            SINGLETON DESIGN PATTERN
->Using singleton design pattern we can create only one object of a class.
 */

class Test{
    private static Test t;
    private Test(){
    }
    void fun(){
        System.out.println("Inside fun()");
    }
    public static Test getInstance(){
        if (t == null){
            t = new Test();
        }
        return t;
    }
}

public class Driver {
    public static void main(String[] args) {
        Test t = Test.getInstance();
        t.fun();
        Test t2 = Test.getInstance();
        System.out.println(t == t2);
    }
}
