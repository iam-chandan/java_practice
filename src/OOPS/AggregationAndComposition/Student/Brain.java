package OOPS.AggregationAndComposition.Student;

public class Brain {
    private float weight;
    private String colour;

    public Brain(float weight,String colour){
        this.weight = weight;
        this.colour = colour;
    }

    public float getWeight(){
        return weight;
    }

    public String getColour(){
        return colour;
    }
}
