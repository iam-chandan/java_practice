package OOPS.Polymorphism.TightCoupling;

class Plane{
    void fly(){
        System.out.println("plane flying");
    }
}

class CargoPlane extends Plane{
    void fly(){
        System.out.println("cargo plane is flying at low height");
    }
}

class PassengerPlane extends Plane{
    void fly(){
        System.out.println("passenger plane is flying at medium height");
    }
}

class FighterPlane extends Plane{
    void fly(){
        System.out.println("fighter plane is flying at great height");
    }
}

public class Driver {
    public static void main(String[] args) {
        /**
         * Tight coupling:-
         * when we create an object if right hand side is child object and
         * left side of object is same reference of child object then that is Tight coupling
         */

        CargoPlane cargoPlane = new CargoPlane(); //->Tight coupling
        PassengerPlane passengerPlane = new PassengerPlane();//->Tight coupling
        FighterPlane fighterPlane = new FighterPlane();//->Tight coupling

        cargoPlane.fly();
        passengerPlane.fly();
        fighterPlane.fly();
    }

}
