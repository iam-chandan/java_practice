package interviewQ_A;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindow2 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 6, 6, 7};
        int target = 3;

        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= target && target <= arr.length; i++) {
            int max1 = Math.max(arr[i - 1], arr[i]);
            int max2 = Math.max(arr[i+1], max1);
            ans.add(max2);
            target++;
        }
        System.out.println(ans);
    }
}
