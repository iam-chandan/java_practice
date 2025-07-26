package Array;

import java.util.Scanner;

public class MaximumCircularSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0;i < arr.length;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(maximumCircularSum(arr));
        }
    }
    public static int maximumCircularSum(int[] arr){
        int n = arr.length;
        int res = arr[0];

        for(int i = 0;i < n;i++){
            int currSum = 0;
            for(int j = 0;j < n;j++){
                int idx = (i + j) % n;
                currSum = currSum + arr[idx];
                res =  Math.max(res,currSum);
            }
        }
        return res;
    }
}
