package Exception.LiskosSubstitutionPriniciple.rule3;

/*
                                        RULE :- 3
-> If the parent class method throws on exception then the override method which in the child class
   can throw a different exception provided both the exception are unchecked.
 */

class ATM{
    public void fun() throws ArithmeticException{
        System.out.println(100/0);
    }
}

class Bank extends ATM{
    public void fun() throws NegativeArraySizeException{
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
package Exception.customException.bank2;

class ATM{
    public void fun() throws ArithmeticException{
        System.out.println(100/0);
    }
}

class Bank extends ATM{
    public void fun() throws NegativeArraySizeException{
        System.out.println("Inside bank");
    }
}

class Driver{
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.fun();
    }
}
 */