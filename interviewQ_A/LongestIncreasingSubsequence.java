package interviewQ_A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.println(longestIncreasingSubsequence1(arr));
        System.out.println(longestIncreasingSubsequence2(arr));
    }
    public static int longestIncreasingSubsequence1(int[] arr) {
        int[] nums = new int[arr.length];
        int size = 0;

        for (int num : arr) {
            int left = 0, right = size;

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            nums[left] = num;

            if (left == size) size++;
        }

        return size;
    }
    public static int longestIncreasingSubsequence2(int[] arr) {
        int n = arr.length;
        int list[] = new int[n];
        Arrays.fill(list, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && list[i] < list[j] + 1) {
                    list[i] = list[j] + 1;
                }
            }
        }
        int max = 1;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, list[i]);
        }
        return max;
    }
}
