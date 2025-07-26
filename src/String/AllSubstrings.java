package String;

public class AllSubstrings {
    static void printAllSubstring(String st){
        int n = st.length();
        for(int i = 0;i <= n;i++){
            for (int j = 0;j <= (n - i);j++){
                for (int k = j;k <= (j + i) - 1;k++){
                    System.out.print(st.charAt(k));
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        String str = "abcde";
        printAllSubstring(str);
    }
}
