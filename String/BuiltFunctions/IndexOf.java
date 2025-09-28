package String.BuiltFunctions;

public class IndexOf {
    static  int indexOf(String str,String st,int k){
        int count = 0;
        char key = st.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (key == str.charAt(i)){
                count++;
            }
            if(count == k){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "How are you?";
        String st = "o";
        int k = 2;
        System.out.println(indexOf(str,st,k));
    }
}
