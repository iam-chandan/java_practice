package OOPS.Polymorphism.PlaneProjectOverridingLooseCoupling;

public class Plane {
    void takeOff(){
        System.out.println("plane is taking off");
    }

    void fly(){
        System.out.println("plane is flying");
    }

    void land(){
        System.out.println("plane is landing");
    }
}

class CargoPlane extends Plane{
    void takeOff() {
        System.out.println("cargo plane is taking off from long sized runway");
    }

    void fly(){
        System.out.println("cargo plane is flying at low height");
    }

    void land(){
        System.out.println("cargo plane is landing on long sized runway");
    }
}

class PassengerPlane extends Plane{
    void takeOff() {
        System.out.println("passenger plane is taking off from medium sized runway");
    }

    void fly(){
        System.out.println("passenger plane is flying at medium height");
    }

    void land(){
        System.out.println("passenger plane is landing on medium sized runway");
    }
}

class FighterPlane extends Plane{
    void takeOff() {
        System.out.println("fighter plane is taking off from short sized runway");
    }

    void fly(){
        System.out.println("fighter plane is flying at great height");
    }

    void land(){
        System.out.println("fighter plane is landing on short sized runway");
    }
}

class Airport{
    static void permit(Plane plane){
        plane.takeOff();
        plane.fly();
        plane.land();
    }
}

class Driver{
    public static void main(String[] args) {
        CargoPlane cargoPlane = new CargoPlane();
        PassengerPlane passengerPlane = new PassengerPlane();
        FighterPlane fighterPlane = new FighterPlane();

        Airport.permit(cargoPlane);
        Airport.permit(passengerPlane);
        Airport.permit(fighterPlane);
    }
}