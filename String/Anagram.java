package String;

import java.util.Arrays;

public class Anagram {
    static boolean isAnagram(String st1,String st2){
        StringBuilder temp = new StringBuilder();
        for (int i = 0;i < st1.length();i++){
            if (st1.charAt(i)  != ' '){
                temp.append(st1.charAt(i));
            }
        }
        st1 = temp.toString();
        temp = new StringBuilder();
        for (int i = 0;i < st2.length();i++){
            if (st2.charAt(i) != ' '){
                temp.append(st2.charAt(i));
            }
        }
        st2 = temp.toString();
        st1 = st1.toLowerCase();
        st2 = st2.toLowerCase();
        char[] arr1 = st1.toCharArray();
        char[] arr2 = st2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        st1 = new String(arr1);
        st2 = new String(arr2);

        return st1.equals(st2);
    }

    public static void main(String[] args) {
        String st1 = "How are you";
        String st2 = "you are how";
        System.out.println(isAnagram(st1,st2));
    }
}
