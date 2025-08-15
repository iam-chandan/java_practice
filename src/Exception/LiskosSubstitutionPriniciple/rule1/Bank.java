package Exception.LiskosSubstitutionPriniciple.rule1;

/*
                    RULE :- 1
-> If a method in parent class throws an exception then it is not compulsory for the override method present
   in the child class also to throw an exception
 */

class ATM {
    public void fun() throws ArithmeticException{
        System.out.println(100/0);
    }
}

class Bank extends ATM{
    public void fun(){
        System.out.println("Inside bank");
    }
}
class Driver{
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.fun();
    }
}

/*
package Exception.customException.bank;

class ATM {
    public void fun() throws ArithmeticException{
        System.out.println(100/0);
    }
}

class Bank extends ATM{
    public void fun() throws ArithmeticException{
        System.out.println("Inside bank");
    }
}
class Driver{
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.fun();
    }
}

o/p :- Inside bank
 */