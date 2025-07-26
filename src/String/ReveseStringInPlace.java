package String;

public class ReveseStringInPlace {
    static String reverseInPlace(String st){
        char[] ch = st.toCharArray();
        int i = 0;
        int j = st.length()-1;

        while (i <= j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String st = "Hello world";
        System.out.println(reverseInPlace(st));
    }
}
