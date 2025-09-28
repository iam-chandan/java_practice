package String;

public class Practice {
    public static void main(String[] args) {
        String str1 = "Kodewala";
        String str2 = " Academy";
        String str3 = str1 + str2;
        String str4 = str1.concat(str2);

        String str5 = "Kodewala" + " Academy";
        String str6 = str5;

        String st = "Kodewala"+'A';
        System.out.println(st);

        String s1 = "Helloworld";
        String s2 = "Hello";
        String s3 = "world";
        String s4 = s2+s3;
        System.out.println(s1 == s4);
        String  s5 = "Hello" + "world";
        System.out.println(s1 == s5);
    }
}
