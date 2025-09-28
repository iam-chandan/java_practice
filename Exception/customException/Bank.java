package Exception.customException;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidUserException extends Exception{
    public String getMessage(){
        return "\uD83D\uDE25 Invalid pin. Try again!";
    }
}

class ATM{
    private int pin = 8888;
    private int p;

    void acceptPin(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the pin :");
        p = scn.nextInt();
    }

    void validatePin() throws InvalidUserException{
        if (pin == p){
            System.out.println("☺ Login successfull");
        }else {
            InvalidUserException iue = new InvalidUserException();
            System.out.println(iue.getMessage());
            throw iue;
        }
    }
}

class Bank {
    void initiate(){
        ATM atm = new ATM();
        try {
            atm.acceptPin();
            atm.validatePin();
        }catch (InvalidUserException e){
            try {
                atm.acceptPin();
                atm.validatePin();
            }catch (Exception f){
                try {
                    atm.acceptPin();
                    atm.validatePin();
                }catch (Exception g){
                    System.out.println("Card blocked");
                    System.exit(0);
                }
            }
        }
    }
}

class Driver{
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.initiate();
    }
}
