package String;

public class OccuranceOfCharacter {
    static int numberOfOccuranceOfCharacter(String st,String s){
        int count = 0;
        char key = s.charAt(0);
        for (int i = 0; i < st.length(); i++) {
            if(key == st.charAt(i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "How are you?";
        String chara = "o";
        System.out.println(numberOfOccuranceOfCharacter(str,chara));
    }
}
