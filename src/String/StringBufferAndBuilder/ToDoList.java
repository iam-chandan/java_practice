package String.StringBufferAndBuilder;

import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter array size : ");
        int n = scn.nextInt();
        StringBuffer[] sb = new StringBuffer[n];
//        sb[0] = new StringBuffer("Buy groceries");
//        sb[1] = new StringBuffer("Finish homework");
//        sb[2] = new StringBuffer("Call the plumber");
        scn.nextLine();
        for (int i = 0; i < sb.length; i++) {
            System.out.println("enter TODO for " + i + " index : ");
            sb[i] = new StringBuffer(scn.nextLine());
        }

        for (int i = 0;i < sb.length;i++){
            System.out.println((i+1) + ". " + sb[i]);
        }
        boolean flag = true;
        while (flag){
            System.out.println("select the number which completed : ");
            int select = scn.nextInt();

            sb[select - 1].append(" - Updated");
            System.out.println("Do you want to update any other list (yes/no) :");
            String res = scn.next();
//            flag = res.equals("no")?false:true; -> ternary operator
            flag = !res.equals("no"); //-> as res assigned "no" value with .equals it will give true "!" symbol will
                                        // turn true to false and vice-versa
        }

        System.out.println("Updated list :");
        for (int i = 0;i < sb.length;i++){
            System.out.println((i + 1)+". "+ sb[i]);
        }
    }
}
