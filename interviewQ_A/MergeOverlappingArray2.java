package interviewQ_A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingArray2 {
    public static List<List<Integer>> merge2(int[][] lists) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(lists,(a,b) -> a[0] - b[0]);

        for (int i = 0; i <= lists.length - 1; i++) {
            System.out.println(lists[i][0] + " " + lists[i][1]);
        }

        int start = lists[0][0];
        int end = lists[0][1];

        for(int i = 1;i < lists.length;i++){
            if (lists[i][0] <= end && lists[i][1] >= start){
                start = Math.min(start, lists[i][0]);
                end = Math.max(end, lists[i][1]);

            }else  {
                res.add(Arrays.asList(start,end));
                start = lists[i][0];
                end = lists[i][1];
            }
        }
        res.add(Arrays.asList(start,end));
        return res;
    }
    public static List<List<Integer>>  merge1(int[][] intervals) {
        List<List<Integer>> list = new ArrayList<>();
        boolean flag = true;
        while (flag){
            int i = 0;
            flag = false;
            int start = intervals[i][0];
            int end = intervals[i][1];
            for (int j = 1; j < intervals.length; j++) {
                //{{1,6},{3,5},{15,18}}
                //      3     <=  6 && 5 >= 1
                if (intervals[j][0] <= end && intervals[j][1] >= start){
                    start = Math.min(start, intervals[j][0]); //1,3
                    end = Math.max(end, intervals[j][1]); // 6,5
                    flag = true;
                }else {
                    list.add(Arrays.asList(start, end));
                    start = intervals[j][0];
                    end = intervals[j][1];
                }

            }
            list.add(Arrays.asList(start,end));
            break;
        }
        return  list;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,6},{0,3},{3,7},{15,18}};
        List<List<Integer>> list = merge1(arr);
        List<List<Integer>> list1 = merge2(arr);
        System.out.println(list);
        System.out.println(list1);
    }
}
