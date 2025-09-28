package OOPS.Inheritance.InheritanceMethods;

public class PassengerPlane extends Plane{
    void fly(){//this is overridden method that means fly() already present in parent class method is same only logic changed
        System.out.println("passenger plane is flying at medium height");
    }

    void carryPassenger(){//this is specialized method i have created only for this class this method not inheritade
        System.out.println("passenger plane is carrying passenger");
    }
}

