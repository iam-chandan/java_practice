package String.Curx_assign;

import java.util.Scanner;

public class StringsStringCompression {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compressString(str));
    }
    public static String compressString(String str){
        StringBuilder sb = new StringBuilder();
        int count  = 1;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i - 1)){
                count++;
            }else {
                sb.append(str.charAt(i - 1));
                if(count > 1) sb.append(count);
                count = 1;
            }
        }

        sb.append(str.charAt(str.length() - 1));
        if (count > 1) sb.append(count);
        return sb.toString();
    }
}

/*
    Take as input S, a string. Write a function that does basic string compression. Print the value returned.
    E.g. for input “aaabbccds” print out a3b2c2ds.


Input Format
A single String S.


Constraints
A string of length between 1 to 1000


Output Format
The compressed String.


Sample Input
aaabbccds
Sample Output
a3b2c2ds
Explanation
In the given sample test case 'a' is repeated 3 times consecutively, 'b' is repeated twice, 'c'
is repeated twice. But, 'd' and 's' occurred only once that's why we do not write their occurrence.
 */