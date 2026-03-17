package interviewQ_A;

import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        String s = "{[()()]}";
        System.out.println(isBalanced(s) ? true : false);
    }
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                char pop = stack.pop();
                if (c == ')' && pop != '(' || c == '}' && pop != '{' || c == ']' && pop != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
