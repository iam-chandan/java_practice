package OOPS.Polymorphism.DownCasting;

class Plane{
    void fly(){
        System.out.println("Plane is flying");
    }
}

class CargoPlane extends Plane{
    void fly(){
        System.out.println("cargo plane is flying at low height");
    }

    void carryCargo(){
        System.out.println("cargo plane are carry cargo");
    }
}

class PassengerPlane extends Plane{
    void fly(){
        System.out.println("passenger plane are flying at medium height");
    }
    void carryPassenger(){
        System.out.println("passenger plane are carry passengers");
    }
}

class FighterPlane extends Plane{
    void fly() {
        System.out.println("fighter plane are flying at great height");
    }

    void carryWeapon(){
        System.out.println("fighter plane are carry weapon");
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
        ((CargoPlane)(plane)).carryCargo();

        plane = passengerPlane;
        plane.fly();
        ((PassengerPlane)(plane)).carryPassenger();

        plane = fighterPlane;
        plane.fly();
        ((FighterPlane)(plane)).carryWeapon();
    }
}
