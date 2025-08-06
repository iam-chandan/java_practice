package OOPS.AggregationAndComposition.Student;

public class Heart {
    private float weight;
    private int bpm;

    public Heart(float weight,int bpm){
        this.weight = weight;
        this.bpm = bpm;
    }

    public float getWeight(){
        return weight;
    }

    public int getBpm(){
        return bpm;
    }
}
