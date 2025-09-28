package String;

public class ReverseString {
    static String reverseString(String str){
        String t = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            t = t + str.charAt(i);
        }
        return t;
    }

    public static void main(String[] args) {
        String str = "how are you?";
        System.out.println(reverseString(str));
    }
}
