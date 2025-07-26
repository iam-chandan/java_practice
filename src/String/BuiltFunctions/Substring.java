package String.BuiltFunctions;

public class Substring {
    static String substring(int startIndex,String st){
        String t = "";
        for (int i = startIndex; i < st.length(); i++) {
            t = t + st.charAt(i);
        }
        return t;
    }

    public static void main(String[] args) {
        String s = "How are you?";
        int startIndex = 4;
        System.out.println(substring(startIndex,s));
    }
}
