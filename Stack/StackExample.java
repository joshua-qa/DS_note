import java.util.Stack;

/**
 * Created by jgchoi.qa on 2017. 3. 7..
 */
public class StackExample {
    private static boolean IsBalanced(String str) {
        Stack<String> stack = new Stack();

        for(int i = 0; i < str.length(); i++) {
            if(str.substring(i, i+1).equals("(") || str.substring(i, i+1).equals("[")) {
                stack.push(str.substring(i, i+1));
            } else {
                if(stack.empty()) {
                    return false;
                }
                String top = stack.pop();
                if( (top.equals("[") && !str.substring(i, i+1).equals("]")) || (top.equals("(") && !str.substring(i, i+1).equals(")")) ) {
                    return false;
                }
            }
        }

        return stack.empty();
    }
    public static void main(String[] args) {
        String str = "([])[]()";
        String str2 = "([)";
        String str3 = "((([[[]]])))";

        /// str = true, str2 = false, str3 = true
        System.out.println(IsBalanced(str));
        System.out.println(IsBalanced(str2));
        System.out.println(IsBalanced(str3));
    }
}