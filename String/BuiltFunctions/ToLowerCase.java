package String.BuiltFunctions;

public class ToLowerCase {
    static String toLowerCase(String str){
        String t = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z'){
                t = t + (char)(c + 32);
            }else {
                t = t + c;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        String st = "HOW ARE YOU?";
        System.out.println(toLowerCase(st));
    }
}
