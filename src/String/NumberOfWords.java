package String;

public class NumberOfWords {
    static int numberOfWords(String st){
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == ' '){
                count++;
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        String str = "How are you?";
        System.out.println(numberOfWords(str));
    }
}
