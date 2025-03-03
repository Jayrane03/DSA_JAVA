package Stack;

import java.util.Stack;

public class stack_collection_framework {

    // Push the element at the bottom of the stack
    public static void pushAtBottom(int data, Stack<Integer> stack) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(data, stack);
        stack.push(top);
    }

    // Reverse the stack using recursion
    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        reverse(stack);
        pushAtBottom(top, stack);
    }

    // Recursive function to delete the middle element
    public static void deleteMiddle(Stack<Integer> st, int sizeOfStack) {
        deleteMiddleHelper(st, sizeOfStack, 0);
    }

    // Helper function to recursively find and remove the middle element
    private static void deleteMiddleHelper(Stack<Integer> st, int sizeOfStack, int currentIndex) {
        if (st.isEmpty() || currentIndex == sizeOfStack / 2) {
            st.pop();  // Remove the middle element
            return;
        }
        int top = st.pop();
        deleteMiddleHelper(st, sizeOfStack, currentIndex + 1);
        st.push(top);  // Push the elements back after removing the middle
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Example stack with 1, 2, 3, 4, 5
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original Stack:");
        printStack(stack);

        // Delete the middle element (3 in this case)
        deleteMiddle(stack, stack.size());

        System.out.println("\nStack after deleting the middle element:");
        printStack(stack);
    }

    // Helper function to print the stack
    public static void printStack(Stack<Integer> stack) {
        for (Integer elem : stack) {
            System.out.println(elem);
        }
    }
}
