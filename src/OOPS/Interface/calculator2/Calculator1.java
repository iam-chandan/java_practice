package OOPS.Interface.calculator2;

import OOPS.Interface.calculator1.Calculator;

public interface Calculator1 {
    void add();
    void sub();
}

class MyCalculator implements Calculator1{
    public void add(){
        System.out.println("Inside add");
    }

    public void sub(){
        System.out.println("Inside sub");
    }

    public void mul(){
        System.out.println("Inside mul");
    }
}

class Driver{
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();

        Calculator1 calculator1;
        calculator1 = myCalculator;

        calculator1.add();
        calculator1.sub();
        ((MyCalculator)(calculator1)).mul();
    }
}