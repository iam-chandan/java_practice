package String;

public class Panagram {
    static boolean isPanagram(String st){
        String alphabate = "abcdefghijklmnopqrstuvwxyz";
        st = st.toLowerCase();
        int count = 0;
        for (int i = 0;i < alphabate.length();i++){
            if(st.indexOf(alphabate.charAt(i)) >= 0){
                count++;
            }else {
                break;
            }
        }
        if (count == 26){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        //String st = "How are you";
        String st = "A quick brown fox jumps over the lazy dog";
        System.out.println(isPanagram(st));
    }
}
