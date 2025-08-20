package multithreading.practice;

import java.util.Scanner;

class Stall implements Runnable{
    private String stallName;
    private String details;
    private double stallArea;
    private String owner;
    private double stallCost;

    public Stall(){

    }
    public Stall(String stallName,String details,double stallArea,String owner){
        this.stallName = stallName;
        this.details = details;
        this.stallArea =  stallArea;
        this.owner = owner;
    }

    public String getStallName(){
        return stallName;
    }
    public String getDetails(){
        return details;
    }
    public double getStallArea(){
        return stallArea;
    }
    public String getOwner(){
        return owner;
    }
    public double getStallCost(){
        return stallCost;
    }
    public void run(){
        stallCost = stallArea * 150;
    }
}
class Driver{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Stall[] stalls =  new Stall[n];
        scn.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("enter stall name :");
            String stallName = scn.nextLine();
            System.out.println("enter stall details :");
            String details = scn.nextLine();
            System.out.println("enter stall area :");
            double stallArea = scn.nextDouble();
            scn.nextLine();
            System.out.println("enter stall owner :");
            String owner = scn.nextLine();
            stalls[i] = new Stall(stallName,details,stallArea,owner);

        }

        for (int i = 0; i < n; i++) {
            Thread t = new Thread(stalls[i]);
            t.start();
            try{
                t.join();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        double totalCost = 0.0;
        for (int i = 0; i < n; i++) {
            totalCost += stalls[i].getStallCost();
        }
        System.out.println(totalCost);
    }
}