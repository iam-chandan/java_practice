package String.BuiltFunctions;

public class LastIndexOf {
    static int lastIndexOf(String str,String st){
        char key = st.charAt(0);
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "welcome to india";
        String ch = "e";
        System.out.println(lastIndexOf(str,ch));
    }
}
