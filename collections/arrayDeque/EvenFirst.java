package collections.arrayDeque;

import java.util.Arrays;

public class EvenFirst{
    static int[] arr1 = {1, 2, 1, 3, 2, 3, 2, 1};
    static int[] arr2 = new int[arr1.length];
    static int index = 0;
    public static void main(String[] args) throws InterruptedException {

        Runnable r1 = () ->{
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i]%2==0){
                    arr2[index++]=arr1[i];
                }
            };
        };

        Runnable r2 = () ->{
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i]%2!=0){
                    arr2[index++]=arr1[i];
                }
            };
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        for(int j=0;j<arr2.length;j++){
            System.out.print(arr2[j] + " " );
        }
    }

}
