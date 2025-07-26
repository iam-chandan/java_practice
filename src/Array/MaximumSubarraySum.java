package Array;

import java.util.Map;
import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
            int n = scn.nextInt();
            int[] arr =  new  int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            System.out.println(maxSubarraySum(arr));
        }
    }
    static int maxSubarraySum(int[] arr){
        /*int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                sum += arr[i];
            }
        }
        return sum;*/
        int maxSoFar = arr[0];
        int maxEndingSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingSoFar = Math.max(arr[i],maxEndingSoFar + arr[i]);
            maxSoFar = Math.max(maxSoFar,maxEndingSoFar);
        }
        return maxSoFar;
    }

}
