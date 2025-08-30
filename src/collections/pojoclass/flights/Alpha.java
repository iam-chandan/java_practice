package collections.pojoclass.flights;

import java.util.ArrayList;

class Flight{
    private String departure;
    private String name;
    private float duration;
    private int price;

    public Flight(){

    }
    public Flight(String departure,String name,float duration,int price){
        this.departure = departure;
        this.name = name;
        this.duration = duration;
        this.price = price;
    }

    public void setDeparture(String departure){
        this.departure = departure;
    }

    public String getDeparture(){
        return departure;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDuration(){
        this.duration = duration;
    }

    public float getDuration(){
        return duration;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public String toString(){
        return "[ departure="+departure+", name="+name+", duration="+duration+", price="+price+" ]";
    }
}

public class Alpha {
    public static void main(String[] args) {
        Flight f1 = new Flight("21:00","indigo",2.5f,5000);
        Flight f2 = new Flight("23:00","goair",2f,4000);
        Flight f3 = new Flight("04:30","spicejet",1.5f,2500);
        Flight f4 = new Flight("16:00","vistara",1f,1500);
        Flight f5 = new Flight("21:30","airindia",3f,5000);
        Flight f6 = new Flight("09:00","indigo",3.5f,5500);
        Flight f7 = new Flight("11:00","spicejet",4f,6000);
        Flight f8 = new Flight("13:00","goair",.5f,1000);

        ArrayList<Flight> flightLists = new ArrayList<Flight>();

        flightLists.add(f1);
        flightLists.add(f2);
        flightLists.add(f3);
        flightLists.add(f4);
        flightLists.add(f5);
        flightLists.add(f6);
        flightLists.add(f7);
        flightLists.add(f8);

        for (Flight flight:flightLists) {
            System.out.println(flight);
        }
    }
}
