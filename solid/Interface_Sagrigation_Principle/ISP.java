package solid.Interface_Sagrigation_Principle;

/*
                            Interface Segregation Principle
 This principle is the first principle that applies to Interfaces instead of classes
 in SOLID, and it is similar to the Single Responsibility principle. It states that do
 not force any client to implement an interface which is irrelevant to them. Here your
 main goal is to focus on avoiding fat interface and give preference to many small
 client-specific interfaces. You should prefer many client interfaces rather than one
 general interface and each interface should have a specific responsibility.
 */

interface Printer{
    void print();
}

interface Scanner {
    void scan();
}

interface FaxMachine{
    void fax();
}

class BasicPrinter implements Printer{
    @Override
    public void print() {
        System.out.println("print");
    }
}
class AllInOnePrinter implements Printer, Scanner, FaxMachine{
    @Override
    public void fax() {
        System.out.println("AllInOnePrinter fax");
    }

    @Override
    public void scan() {
        System.out.println("AllInOnePrinter scan");
    }

    @Override
    public void print() {
        System.out.println("AllInOnePrinter print");
    }
}
public class ISP {
    public static void main(String[] args) {
        BasicPrinter printer = new BasicPrinter();
        AllInOnePrinter allInOnePrinter = new AllInOnePrinter();
        printer.print();
        allInOnePrinter.fax();
        allInOnePrinter.scan();
        allInOnePrinter.print();
    }
}
