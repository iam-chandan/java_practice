package OOPS.StaticAndInstance.part2;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.acceptInput();
        c1.area();
        c1.displayArea();

        Circle c2 = new Circle();
        c2.acceptInput();
        c2.area();
        c2.displayArea();
    }
}
