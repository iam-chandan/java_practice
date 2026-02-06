package stream_api;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "I love india";
        Map<Character,Long> freq = str.chars()
                .filter(n -> n != ' ') //only characters will store and space will remove
                .map(Character::toLowerCase) // converting all characters to lower case
                .mapToObj(c -> (char)c) // converting to character object
                .collect(Collectors.groupingBy(c->c,Collectors.counting())); //counting frequency
        System.out.println(freq);
    }
}
