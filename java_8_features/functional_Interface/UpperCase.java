package java_8_features.functional_Interface;

public interface UpperCase {
    String convert(String s);
}

class Convert{
    public static void main(String[] args) {
        UpperCase upperCase = (s)->s.toUpperCase();
        String result = upperCase.convert("hello");
        System.out.println(result);
    }
}
