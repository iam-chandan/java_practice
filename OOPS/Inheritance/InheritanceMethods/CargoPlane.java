package OOPS.Inheritance.InheritanceMethods;

public class CargoPlane extends Plane{
    void fly(){//this is overridden method that means fly() already present in parent class method is same only logic changed
        System.out.println("cargo plane is flying at low height");
    }

    void carryCargo(){//this is specialized method i have created only for this class this method not inheritade
        System.out.println("cargo plane is carrying cargo");
    }
}
