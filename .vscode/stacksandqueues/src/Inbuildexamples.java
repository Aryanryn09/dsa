import java.util.Stack;

public class Inbuildexamples {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(182);
        stack.push(232);
        stack.push((int)(234.234f));
        System.out.println( stack.pop());
        System.out.println(stack.pop());
        System.out.println( stack.pop());
    }
}
