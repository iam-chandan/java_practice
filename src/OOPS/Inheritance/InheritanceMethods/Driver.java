package OOPS.Inheritance.InheritanceMethods;

public class Driver {
    public static void main(String[] args) {
        CargoPlane cargoPlane = new CargoPlane();
        cargoPlane.takeOff();
        cargoPlane.fly();
        cargoPlane.land();
        cargoPlane.carryCargo();

        System.out.println("*********************************");

        PassengerPlane passengerPlane = new PassengerPlane();
        passengerPlane.takeOff();
        passengerPlane.fly();
        passengerPlane.land();
        passengerPlane.carryPassenger();
        System.out.println("*********************************");

        FighterPlane fighterPlane = new FighterPlane();
        fighterPlane.takeOff();
        fighterPlane.fly();
        fighterPlane.land();
        fighterPlane.carryWeapon();


    }
}
