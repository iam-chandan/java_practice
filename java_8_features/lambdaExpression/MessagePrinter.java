package java_8_features.lambdaExpression;

public interface MessagePrinter {
    void print();
}
class Print{
    public static void main(String[] args) {
        MessagePrinter msg = () -> System.out.println("Hello Lambda!!");
        msg.print();
    }
}
