package java_8_features.lambdaExpression;

@FunctionalInterface
public interface Check {
    boolean isEven(int n);
}
class Even{
    public static void main(String[] args) {
        Check check = (n)->{
            return n % 2 == 0;
        };
        boolean res = check.isEven(16);
        System.out.println(res);
    }
}
