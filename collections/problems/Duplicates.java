package collections.problems;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

/*
remove duplicates from string
 */

public class Duplicates {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        LinkedHashSet<Character> duplicate = new LinkedHashSet<Character>();
        for (int i = 0;i < str.length();i++){
            duplicate.add(str.charAt(i));
        }
        System.out.println(duplicate);
    }
}
/*
mississippi
[m, i, s, p]
 */