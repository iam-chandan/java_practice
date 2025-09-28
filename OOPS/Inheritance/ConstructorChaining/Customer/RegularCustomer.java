package OOPS.Inheritance.ConstructorChaining.Customer;

/**
 * previously we have seen that private members can not be inherit but using super() method we can call parent class
 * constructor from child class using constructor and can do the initialization
 */
public class RegularCustomer extends Customer{
    private float discount;

    public RegularCustomer(int id,String name,long mobile,String address,float discount){
        super(id,name,mobile,address);
        this.discount = discount;
    }

    void getDiscount(){
        System.out.println("you have got " + discount + "% discount, enjoy your food.!!!!");
    }
}
