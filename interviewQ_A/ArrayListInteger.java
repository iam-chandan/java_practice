package interviewQ_A;

import java.util.ArrayList;
import java.util.Iterator;

class Driver extends ArrayList<Integer> {
    public int secondElement(){
        return super.get(1);
    }

    @Override
    public Integer get(int index){
        return super.get(2);
    }

    public void remove(){
        Iterator<Integer> iterator = super.iterator();
        while (iterator.hasNext()){
            if(isPrime(iterator.next())){
                iterator.remove();
            }
        }
    }

    public boolean isPrime(int n){
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
public class ArrayListInteger{
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.add(1);
        driver.add(2);
        driver.add(3);
        driver.add(4);
        driver.add(5);
        driver.add(6);
        driver.add(7);
        driver.add(8);
        driver.add(9);
        driver.add(10);
        System.out.println("size of array list : " + driver.size());
        System.out.println("second element : " + driver.secondElement());
        System.out.println("get element : " + driver.get(1));
        System.out.println("before remove array list : " + driver);
        driver.remove();
        System.out.println("second element : " + driver.secondElement());
        System.out.println("get element : " + driver.get(1));
        System.out.println("after remove array list : " + driver);
    }
}