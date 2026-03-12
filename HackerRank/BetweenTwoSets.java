package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {
    public static void main(String[] args) {
        List <Integer> a = Arrays.asList(2,4);
        List <Integer> b = Arrays.asList(16, 32, 96);
        System.out.println(getTotalX(a,b));
    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int maxA = a.get(0),maxB = b.get(0),count = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > maxA){
                maxA = a.get(i);
            }
        }

        for (int i = 0; i < b.size(); i++) {
            if (b.get(i) < maxB){
                maxB = b.get(i);
            }
        }

        for(int i = maxA;i <= maxB;i++){
            boolean isFactorsOfAllA = true;
            for (int valA : a){
                if (i % valA != 0){
                    isFactorsOfAllA =  false;
                    break;
                }
            }

            if (isFactorsOfAllA){
                boolean isFactorsOfAllB = true;
                for (int valB : b){
                    if(valB % i != 0){
                        isFactorsOfAllB = false;
                        break;
                    }
                }
                if (isFactorsOfAllB){
                    count++;
                }
            }
        }
        return count;
    }
}
