package interviewQ_A;

public class SumDigitsUntilSingleDigit {
    public static void main(String[] args) {
        int num = 1452362123;
        while(num > 9){
            int res = 0;
            while (num > 0){
                res += num % 10;
                num /= 10;
            }
            num = res;
        }
        System.out.println(num);
    }
}
