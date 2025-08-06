package OOPS.AggregationAndComposition.Student;

public class Driver {
    public static void main(String[] args) {
        Student student = new Student();
        Bike bike = new Bike("JAWA",35);
        Book book = new Book("JAVA","JG");

        System.out.println(student.heart.getWeight());
        System.out.println(student.heart.getBpm());
        System.out.println(student.brain.getWeight());
        System.out.println(student.brain.getColour());

        student.hasA(bike);
        student.hasA(book);

        student = null;
        /*
        System.out.println(student.heart.getWeight());
        System.out.println(student.heart.getBpm());
        System.out.println(student.brain.getWeight());
        System.out.println(student.brain.getColour());

        student.hasA(bike);
        student.hasA(book);
        */
        System.out.println(bike.getName());
        System.out.println(bike.getMileage());
        System.out.println(book.getName());
        System.out.println(book.getAuthor());

    }
}
