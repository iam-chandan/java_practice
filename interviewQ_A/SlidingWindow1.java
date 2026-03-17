package interviewQ_A;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindow1 {
    public static void main(String[] args) {
        char[] arr = {'a','b','c'};

        int target = 2;
        List<String> result = new ArrayList<>();

        for (int i = 0; i <= arr.length-target; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < target + i; j++) {
                sb.append(arr[j]);
            }
            result.add(sb.toString());
        }
        System.out.println(result);
    }
}
