package String.BuiltFunctions;

public class Trim {
    static String trim(String str){
        String t = "";
        int si = 0;
        int ei = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' '){
                si = i;
                break;
            }
        }
        for (int i = str.length()-1; i >= 0 ; i--) {
            if (str.charAt(i) != ' '){
                ei = i;
                break;
            }
        }
        for (int i = si; i <=ei; i++) {
            t = t + str.charAt(i);
        }
        return t;
    }

    public static void main(String[] args) {
        String str = "     how are you?       ";
        String result = trim(str);
        System.out.println(str);
        System.out.println(result);
    }
}
