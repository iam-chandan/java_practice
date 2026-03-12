package interviewQ_A;

import java.util.ArrayList;
import java.util.List;

public class MergeArray {
    public static void main(String[] args) {
//        int[][] arr = {{1,5},{2,6},{8,10}};
        int[][] arr = {{1,4},{4,6},{8,10}};
        System.out.println(mergeArray(arr));
    }

    private static List<List<Integer>> mergeArray(int[][] arr) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(arr[i][0]);
            temp.add(arr[i][1]);
            list.add(temp);
        }

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    int start1 = list.get(i).get(0);
                    int end1 = list.get(i).get(1);

                    int start2 = list.get(j).get(0);
                    int end2 = list.get(j).get(1);

                    if (start2 <= end1 && start1 <= end2) {
                        int newStart = Math.min(start1, start2);
                        int newEnd = Math.max(end1, end2);

                        list.get(i).set(0, newStart);
                        list.get(j).set(1, newEnd);

                        list.remove(j);
                        flag = true;
                        break;
                    }
                }
                if (flag) break;
            }
        }
        return list;
    }
}
