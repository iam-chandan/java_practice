package String;

/**
 * Print Frequencies of character in sorted order in string of lower case alphabets
 */
public class FrequencieOfCharacter {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
        /* here in the next line i am doing minus from "a"s ASCII value to strings
         particular characters ASCII value after
        this i am storing the difference value in count array
        * */
            count[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if(count[i]>0){
                /*
                here i am printing what ever the index adding with 'a's ASCII value to it so that we get the character
                and count value also
                * */
                System.out.println((char) (i+'a')+" "+count[i]);
            }
        }
    }
}
