package String.BuiltFunctions;

public class EndWith {
    static boolean endWith(String s,String t){
        int count = 0;
        for (int i = s.length() - t.length();i < s.length();i++){
            if (s.charAt(i) == t.charAt(count)){
                count++;
            }
        }
        if (t.length() == count){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String st = "Hello";
        String t = "llo";
        System.out.println(endWith(st,t));
    }
}
