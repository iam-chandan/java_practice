package OOPS.Polymorphism.overriding;

class Parent{
    @Deprecated // deprecated means this methods new version came so use that instead of this method
    void setDateAndTime(){
        System.out.println("12:20 AM");
    }
}

class Child extends Parent{
    @Override  // this annotation used for to mention that the particular method is overridden from parent class
    @Deprecated
    void setDateAndTime(){
        System.out.println("12:30 AM");
    }
}

public class Driver {
    public static void main(String[] args) {
        Child child =  new Child();
        child.setDateAndTime();
    }
}
