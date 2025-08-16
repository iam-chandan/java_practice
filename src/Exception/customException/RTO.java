package Exception.customException;

import java.util.Scanner;

class UnderAgeException extends Exception{
    public String getMessage(){
        return "You are too young, get patience";
    }
}

class OverAgeException extends Exception{
    public String getMessage(){
        return "You are too old, calm down";
    }
}

class Application{
    private int age;
    public void acceptInput(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the age :");
        age = scn.nextInt();
    }

    public void validateAge() throws UnderAgeException,OverAgeException{
        if (age >= 18 && age <= 60){
            System.out.println("Licence created successfully");
        }else if (age < 18){
            UnderAgeException uae = new UnderAgeException();
            System.out.println(uae.getMessage());
            throw uae;
        }else {
            OverAgeException oae = new OverAgeException();
            System.out.println(oae.getMessage());
            throw oae;
        }
    }
}
public class RTO {
    public void initiate(){
        Application ap = new Application();
        for (;;) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Do you want to apply? Yes/no");
            String ans = scn.next();
            if (ans.equals("Yes")){
                try {
                    ap.acceptInput();
                    ap.validateAge();
                }catch (Exception e){

                }
            }else {
                System.out.println("Thank you visit again!");
                System.exit(0);
            }
        }
    }
}

class Driver1{
    public static void main(String[] args) {
        RTO rto = new RTO();
        rto.initiate();
    }
}
