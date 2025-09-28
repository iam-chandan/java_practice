package String.BuiltFunctions;

public class Replace {
    static String replace(String s,char old_char,char new_char){
        char[] ch = s.toCharArray();
        for (int i = 0;i < ch.length;i++){
            if (ch[i] == old_char){
                ch[i] = new_char;
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String s = "How are you?";
        char old_char = '?';
        char new_char = '!';
        System.out.println(replace(s,old_char,new_char));
    }
}
