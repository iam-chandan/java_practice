package String.BuiltFunctions;

public class StartsWith {
    static boolean startsWith(String s,String t){
        int count = 0;
        for (int i = 0; i < t.length(); i++) {
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
        String t = "Hel";
        System.out.println(startsWith(st,t));
    }
}
