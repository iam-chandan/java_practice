package String.BuiltFunctions;

public class Equals {
    static boolean equals(String st1,String st2){
        if(st1.length() != st2.length()){
            return false;
        }

        for (int i = 0; i < st1.length(); i++) {
            if (st1.charAt(i) != st2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(equals(str1,str2));
    }
}
