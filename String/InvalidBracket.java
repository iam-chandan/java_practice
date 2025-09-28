package String;

public class InvalidBracket {
    public static void main(String[] args) {
        String st = ")))(((())";
        int bracket = 0;
        int count = 0;
        for (int i =0 ;i <st.length();i++){
            char ch = st.charAt(i);
            if (ch == '('){
                bracket++;
            }else {
                if (bracket <= 0){
                    count++;
                }else {
                    bracket--;
                }
            }
        }
        System.out.println("Total invalid brackets : " + (count + bracket));
    }
}
