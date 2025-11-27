package java_8_features.lambdaExpression;

@FunctionalInterface
public interface Calc {
    int operation(int a,int b);
}

class Claculator{
    public static void main(String[] args) {
        Calc add = (a,b)->a+b;
        Calc sub = (a,b)->a-b;
        Calc mul = (a,b)->a*b;
        Calc div = (a,b)->a/b;
        System.out.println(add.operation(12,14));
        System.out.println(sub.operation(15,9));
        System.out.println(mul.operation(12,7));
        System.out.println(div.operation(12,4));
    }
}
