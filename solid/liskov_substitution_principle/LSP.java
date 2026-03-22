package solid.liskov_substitution_principle;

/*
                          Liskov Substitution Principle
 The principle was introduced by Barbara Liskov in 1987 and according to this principle
 Derived or child classes must be substitutable for their base or parent classes. This
 principle ensures that any class that is the child of a parent class should be usable
 in place of its parent without any unexpected behavior.
 */

class Vehicle{
    public void startEngine(){
        System.out.println("Engine started");
    }
}

class Car extends Vehicle{

    @Override
    public void startEngine(){
        System.out.println("Starting a Car");
    }
}

class Bike extends Vehicle{
    @Override
    public void startEngine(){
        System.out.println("Starting a Bike");
    }
}

class Bicycle extends Vehicle{
    @Override
    public void startEngine(){
        throw  new UnsupportedOperationException("Bicycle do not have engine.");
    }
}
public class LSP {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bicycle = new Bicycle();

        car.startEngine();
        bike.startEngine();

        try {
            bicycle.startEngine();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
