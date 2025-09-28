package Array;

import java.util.Arrays;
import java.util.Scanner;

public class FormBiggestNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String[] arr = new String[n];

            for(int i = 0;i < arr.length;i++){
                arr[i] = sc.next();
            }
            System.out.println(biggestNumber(arr));
        }
    }
    static String biggestNumber(String[] arr){
        Arrays.sort(arr,(a, b) -> (b + a).compareTo(a + b));

        StringBuilder res = new StringBuilder();
        for(String num : arr){
            res.append(num);
        }
        return res.toString();
    }
}
