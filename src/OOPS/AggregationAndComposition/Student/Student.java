package OOPS.AggregationAndComposition.Student;

public class Student {
    Heart heart = new Heart(25.6f,72);
    Brain brain = new Brain(30.2f,"gray");

    void hasA(Bike bike){
        System.out.println(bike.getName());
        System.out.println(bike.getMileage());
    }

    void hasA(Book book){
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
    }
}
