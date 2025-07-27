package String;

public class AllSubstrings {
    static void printAllSubstring(String st){
        int n = st.length();
        for(int i = 1;i <= n;i++){                      // (1) Length of substring
            for (int j = 0;j <= (n - i);j++){           // (2) Start index of substring
                for (int k = j;k <= (j + i) - 1;k++){   // (3) Actual character printing
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
/*
* For string of length n, the number of substrings is: n(n+1)/2 => 5*6/2 = 15
* */