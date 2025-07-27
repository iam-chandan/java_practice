package String;

public class LongestPalindromicSubstring {
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
    static String longestPalindromicSubstring(String s){
        int n = s.length();
        String res = "";
        for (int i = 1;i < n;i++){
            for (int j = 0;j <= (n - i);j++){
                StringBuilder temp = new StringBuilder();
                for (int k = j;k < (j + i) ;k++){
                    temp.append(s.charAt(k));
                }
                if (isPalindrom(temp.toString())){
                    res = temp.toString();
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String st = "abacd";
        System.out.println(longestPalindromicSubstring(st));
    }
}
