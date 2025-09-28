package OOPS.Polymorphism.LooseCoupling;


class Plane {
    void fly(){
        System.out.println("plane is flying");
    }
}

class CargoPlane extends Plane{
    void fly(){
        System.out.println("cargo plane is flying at low height");
    }
}

class FighterPlane extends Plane{
    void fly(){
        System.out.println("fighter plane is flying at greater height");
    }
}

class PassengerPlane extends Plane{
    void fly(){
        System.out.println("Passenger plane is flying at medium height");
    }
}

public class Driver {
    public static void main(String[] args) {
        CargoPlane cargoPlane = new CargoPlane();
        PassengerPlane passengerPlane = new PassengerPlane();
        FighterPlane fighterPlane = new FighterPlane();

        Plane plane;
        plane = cargoPlane;
        plane.fly();

        plane = passengerPlane;
        plane.fly();

        plane = fighterPlane;
        plane.fly();
    }
}
