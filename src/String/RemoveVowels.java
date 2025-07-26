package String;

public class RemoveVowels {
    static String removeVowels(String st){
        String t = "";
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
                continue;
            }else {
                t += ch;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        String st = "coding";
        System.out.println(removeVowels(st));
    }
}
