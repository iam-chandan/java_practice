package Exception.LiskosSubstitutionPriniciple.rule2;

/*
                            RULE :- 2
-> If a method present in parent class throws one type of exception and override method in child
   class throws another type of exception then it is not permitted.
 */

class ATM{
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