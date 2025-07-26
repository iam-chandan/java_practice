package Array;
import java.util.*;

public class SortingInLinearTime {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++)
            arr[i]=scn.nextInt();
        sortColors(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void sortColors(int[] nums) {
        // Write your code here
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
    public static void swap(int[] arr,int a ,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
