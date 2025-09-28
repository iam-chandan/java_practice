package String;

public class Palindrom {
    public static boolean isPalindrom(String st){
        int i = 0;
        int j = st.length()-1;
        while (i <= j){
            if (st.charAt(i) != st.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "malayalam";
        System.out.println(isPalindrom(str));
    }
}
