package String;

public class SubstringWithLength {
    static void printAllSubstring(String st, int k){
        int n = st.length();
        for(int start = 0;start <= (n - k);start++){
            for (int end = start;end < (start + k) ;end++){
                System.out.print(st.charAt(end));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String str = "coding";
        int k = 3;
        printAllSubstring(str,k);
    }
}
