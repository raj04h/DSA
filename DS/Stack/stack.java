package Stack;

import java.util.Stack;

public class stack{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop()); // 3

        // Peek at the top element without removing it
        System.out.println("Top element: " + stack.peek()); // 2

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // false

        // Print all elements
        System.out.println("Stack elements: " + stack); // [1, 2]
    }
}