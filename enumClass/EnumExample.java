package enumClass;

public class EnumExample{
    public static void main(String[] args) {
        Month month = Month.APR;
        switch (month){
            case JAN -> System.out.println("JANUARY");
            case FEB -> System.out.println("FEBRUARY");
            case MAR -> System.out.println("MARCH");
            case APR -> System.out.println("APRIL");
            case MAY -> System.out.println("MAY");
            case JUN -> System.out.println("JUNE");
            case JUL -> System.out.println("JULY");
            case AUG -> System.out.println("AUGUST");
            case SEP -> System.out.println("SEPTEMBER");
            case OCT -> System.out.println("OCTOBER");
            case NOV -> System.out.println("NOVEMBER");
            case DEC -> System.out.println("DECEMBER");
            default -> System.out.println("please select from enum");
        }
    }
}
