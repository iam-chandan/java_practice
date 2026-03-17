package interviewQ_A;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindow2 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 6, 6, 7};
        int target = 3;

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length - target; i++) {
            for (int j = i; j < target + i; j++) {
                int max1 = Math.max(arr[j - 1], arr[j -2]);
                int max2 = Math.max(arr[j], max1);
                ans.add(max2);
            }
        }
        System.out.println(ans);
    }
}
