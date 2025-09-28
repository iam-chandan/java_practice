package OOPS.StaticAndInstance.part3;

public class Main {

    /**
     * when ever JVM call a class then first check
     * 1.static variable is present or not then
     * 2.static block is present or not then
     * 3.static method is present or not
     * step by step JVM will allocate the memory. so main() method is static so it is in the 3rd step
     *
     * Q. print "JAVA" but not in main() method ?
     */

    static {
        System.out.println("JAVA"); //1st this will print
    }
    public static void main(String[] args) {
        System.out.println("PYTHON"); //2nd this will print bcz JVM prioritize static block over static method that is why first "JAVA" printed the "PYTHON" printed
    }
}
