package java_8_features.functional_Interface;
/*
    What is functional interface?
    -> the interface wgo contains only one abstract method but can have multiple default and static method
       is known as functional interface.
       Ex :- Runnable   => run()
             Callable   => call()
             Comparable => compareTo()
             Comparator => compare()
 */

@FunctionalInterface
public interface LengthFinder {
    int length(String str);
}
class LengthFind{
    public static void main(String[] args) {
        LengthFinder len = (str) -> str.length();
        int result = len.length("hello");
        System.out.println(result);
    }
}