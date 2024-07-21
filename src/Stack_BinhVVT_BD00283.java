import java.util.Stack;

public class Stack_BinhVVT_BD00283 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(283);
        stack.push(113);
        stack.push(220);

        // Pop element
        System.out.println("Popped element is: " + stack.pop());

        // Peek element
        System.out.println("Top element is: " + stack.peek());
    }
}
