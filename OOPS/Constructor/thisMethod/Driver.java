package OOPS.Constructor.thisMethod;

public class Driver {
    public static void main(String[] args) {
        Car car = new Car("Benz",2536);
        System.out.println(car.getCarName() + " " + car.getModelNo());
    }
}
