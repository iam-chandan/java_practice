package String.BuiltFunctions;

public class ToCharArray {
    static char[] toCharArray(String str){
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "welcome to india";
        System.out.println(toCharArray(str));
    }
}
