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
//            System.out.println("enter stall name :");
//            String stallName = scn.nextLine();
//            System.out.println("enter stall details :");
//            String details = scn.nextLine();
//            System.out.println("enter stall area :");
//            double stallArea = scn.nextDouble();
//            scn.nextLine();
//            System.out.println("enter stall owner :");
//            String owner = scn.nextLine();
//            stalls[i] = new Stall(stallName,details,stallArea,owner);

            System.out.println("All details about stall :");
            String s = scn.nextLine();
            String[] split = s.split(",");
            stalls[i] =  new Stall(split[0],split[1],Integer.parseInt(split[2]),split[3]);
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

/*
3
enter stall name :
book stall
enter stall details :
stall for books
enter stall area :
25
enter stall owner :
ram
enter stall name :
food stall
enter stall details :
stall for food
enter stall area :
60
enter stall owner :
abhijit
enter stall name :
snack stall
enter stall details :
stall for snack
enter stall area :
30
enter stall owner :
chinmay
17250.0
 */

/*
    UDING .split(",") as we know split will return an array

3
All details about stall :
book stall,stall for books,25,swarna
All details about stall :
food stall,stall for food,60,raj
All details about stall :
snack stall,stall for snack,30,abhijit
17250.0
 */