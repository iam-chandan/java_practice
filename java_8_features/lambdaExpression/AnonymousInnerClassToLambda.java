package java_8_features.lambdaExpression;

public class AnonymousInnerClassToLambda {
    public static void main(String[] args) {
        Runnable r = ()-> System.out.println("running");
        r.run();
    }
}
