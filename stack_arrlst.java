package DS;
import java.util.ArrayList;

public class stack_arrlst {
    private final ArrayList<Integer> list = new ArrayList<>();

    public void push(int value) {
        list.add(value);
    }

    public int pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return list.remove(list.size() - 1);
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        stack_arrlst  stack = new stack_arrlst ();

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
    }
}
