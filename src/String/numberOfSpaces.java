package String;

public class numberOfSpaces {
    static int spaceCount(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "How are you?";
        System.out.println(spaceCount(str));
    }
}
