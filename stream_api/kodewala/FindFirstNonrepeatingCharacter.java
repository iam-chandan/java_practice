package stream_api.kodewala;

public class FindFirstNonrepeatingCharacter {
    public static void main(String[] args) {
        String input = "anurag";
        Character chr = input.chars().mapToObj(c -> (char) c)
                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
                .findFirst()
                .orElse(null);
        System.out.println(chr);
    }
}
