package OOPS.AggregationAndComposition.Student;

public class Bike {
    private String name;
    private int mileage;

    public Bike(String name,int mileage){
        this.name = name;
        this.mileage = mileage;
    }

    public String getName(){
        return name;
    }

    public int getMileage(){
        return mileage;
    }
}
