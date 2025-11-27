package String.Curx_assign;

import java.util.Scanner;

public class CanYouReadThis {
    public static void canYouRead(String str){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //will check if character is upper case
            if(Character.isUpperCase(ch) && res.length() > 0){
                System.out.println(res);
                res.setLength(0);
            }
            res.append(ch);
        }

        if(res.length() > 0){
            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        canYouRead(str);
    }
}
