package String.BuiltFunctions;

public class Split {
    public static void main(String[] args) {
        String str = "welcome to bangalore where weather is pleasant";
        String[] st = str.split(" ");
        for (int i = 0;i < st.length;i++) {
            System.out.println(st[i]);
        }
    }
}
