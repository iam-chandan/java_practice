package interviewQ_A;

public class ReverseString {
    public static void main(String[] args) {
        String str = "I love programming in Java";
        String[] arr =  str.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if(i != 0){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
