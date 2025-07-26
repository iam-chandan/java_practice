package String.BuiltFunctions;

public class ToUpperCase {
    static String toUpperCase(String str){
        String t = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z'){
                t = t + (char)(c - 32);
            }else {
                t = t + c;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        String str = "How are you?";
        System.out.println(toUpperCase(str));
    }
}
