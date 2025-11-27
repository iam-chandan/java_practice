package java_8_features.lambdaExpression;

public interface Add {
    void add(int a,int b);
}

class LambdaExmp{
    public static void main(String[] args) {
        Add add = (a,b)-> System.out.println(a+b);
        add.add(10,20);
    }
}
