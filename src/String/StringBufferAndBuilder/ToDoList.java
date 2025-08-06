package String.StringBufferAndBuilder;

public class ToDoList {
    public static void main(String[] args) {
        StringBuffer[] sb = new StringBuffer[3];
        sb[0] = new StringBuffer("Buy groceries");
        sb[1] = new StringBuffer("Finish homework");
        sb[2] = new StringBuffer("Call the plumber");
        for (int i = 0;i < sb.length;i++){
            System.out.println(sb[i]);
        }

        sb[1].append(" - Updated");

        for (int i = 0;i < sb.length;i++){
            System.out.println(sb[i]);
        }
    }
}
