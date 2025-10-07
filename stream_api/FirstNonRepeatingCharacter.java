package stream_api;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String ch = "anupam";

        // 1st process
        Character cha = ch.chars() //her converts string to IntStream
                .mapToObj(c -> (char) c) //Int to character
                .filter(c -> ch.indexOf(c) == ch.lastIndexOf(c)) // filters only non-repeating
                .findFirst() // get first one
                .orElse(null); // or else return null

        System.out.println(cha);

        // 2nd process
        ch.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> ch.indexOf(c) == ch.lastIndexOf(c))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
