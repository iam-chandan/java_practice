package collections.pojoclass.comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class CompareDeparture implements Comparator<Flight>{
    public int compare(Flight f1,Flight f2){
        String departure1 = f1.getDeparture();
        String departure2 = f2.getDeparture();
        return departure1.compareTo(departure2);
    }
}

class CompareName implements Comparator<Flight>{
    public int compare(Flight f1,Flight f2){
        String name1 = f1.getName();
        String name2 = f2.getName();
        return name1.compareTo(name2);
    }
}

class CompareDuration implements Comparator<Flight>{
    public int compare(Flight f1,Flight f2){
        Float duration1 = f1.getDuration();
        Float duration2 = f2.getDuration();
        return duration1.compareTo(duration2);
    }
}

class ComparePrice implements Comparator<Flight>{
    public int compare(Flight f1,Flight f2){
        Integer price1 = f1.getPrice();
        Integer price2 = f2.getPrice();
        return price1.compareTo(price2);
    }
}

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

        //as we know that ArrayList follows insertion order so to sort we use Collection classes sort() method and in
        // Flight class implement Comparable README.md and compareTo() method of Comparable README.md will implement
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number to sort as per that :");
        System.out.println("1. Departure");
        System.out.println("2. Name");
        System.out.println("3. Duration");
        System.out.println("4. price");

        int choice = scn.nextInt();
        if (choice == 1){
            Collections.sort(flightLists, new CompareDeparture());
        } else if (choice == 2) {
            Collections.sort(flightLists, new CompareName());
        } else if (choice == 3) {
            Collections.sort(flightLists, new CompareDuration());
        }else {
            Collections.sort(flightLists, new ComparePrice());
        }

        for (Flight flight:flightLists) {
            System.out.println(flight);
        }
    }
}
