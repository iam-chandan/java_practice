package String;

public class LongestSubstring {
    static String longestNonRepeatingSubstring(String st){
        String res = "";
        for(int i = 0;i < st.length();i++){
            String temp = "";
            for (int j = i;j < st.length();j++){
                if (temp.indexOf(st.charAt(j)) == -1){
                    temp = temp + st.charAt(j);
                }else {
                    break;
                }
            }
            if (temp.length() > res.length()){
                res = temp;
            }
        }
        return res;
    }
    public static void main(String[] args){
        String st = "kodewalaacademy";
        System.out.println(longestNonRepeatingSubstring(st));
    }
}
