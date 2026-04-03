package interviewQ_A;

import java.util.Arrays;

public class QuickSort {
    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }

    public static void quickSort(int[] arr,int left,int right){
        if(left < right){
            int pi = partition(arr,left,right);
            quickSort(arr,left,pi - 1);
            quickSort(arr,pi + 1,right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,8,2,3,4,6};
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
