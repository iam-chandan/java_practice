package OOPS.Constructor.thisMethod;

public class Car {
    private String carName;
    private int modelNo;

    public Car(){
        carName = "BMW";
    }

    public Car(String carName,int modelNo){
        this();
    }

    public String getCarName(){
        return carName;
    }

    public int getModelNo(){
        return modelNo;
    }
}
