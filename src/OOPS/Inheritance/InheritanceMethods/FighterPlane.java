package OOPS.Inheritance.InheritanceMethods;

public class FighterPlane extends Plane{
    void fly(){ //this is overridden method that means fly() already present in parent class method is same only logic changed
        System.out.println("fighter plane is flying at great height");
    }

    void carryWeapon(){//this is specialized method i have created only for this class this method not inheritade
        System.out.println("fighter plane is carrying weapon");
    }
}
