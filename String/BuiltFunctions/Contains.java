package String.BuiltFunctions;

public class Contains {
    static boolean contains(String s,String t){
        int count = 0;
        for (int i = 0; i < s.length() && count < t.length(); i++) {
            if (s.charAt(i) == t.charAt(count)){
                count++;
            }else {
                count = 0;
            }
        }
        if (t.length() == count){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "How are you";
        String t = "aee";
        System.out.println(contains(s,t));
    }
}
