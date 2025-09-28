package collections.problems;

import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDuplicateNames {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String st = scn.next();
        String[] names = st.split(",");
        TreeSet<String> name = new TreeSet<String>();
        for (String str : names){
            name.add(str);
        }
        System.out.println(name);
    }
}

/*
bob,mark,bilbo,mark,bob,alex
[alex, bilbo, bob, mark]
 */