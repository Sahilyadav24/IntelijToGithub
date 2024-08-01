package Practise_Coding;
import java.util.Stack;

class StackSort {
    public static void sortStack(Stack<Integer> inputStack) {
        // Create an empty stack to help with sorting
        Stack<Integer> sortedStack = new Stack<>();

        // While there are elements in the input stack
        while (!inputStack.isEmpty()) {
            // Pop an element from the input stack
            int temp = inputStack.pop();

            // While the sorted stack is not empty and the top element of the sorted stack is greater than temp
            while (!sortedStack.isEmpty() && sortedStack.peek() > temp) {
                // Push the top element from the sorted stack back to the input stack
                inputStack.push(sortedStack.pop());
            }

            // Push the temp element onto the sorted stack
            sortedStack.push(temp);
        }

        // Print the sorted stack
        while (!sortedStack.isEmpty()) {
            System.out.print(sortedStack.pop() + " ");
        }
    }
    public static void main(String[] args) {
        Stack<Integer> inputStack = new Stack<>();
        // Sample input
        int[] array = {3, -1, 2, 5, -6, 4};

        // Push all elements of the array into the input stack
        for (int num : array) {
            inputStack.push(num);
        }

        System.out.println("Sorted stack:");
        sortStack(inputStack);
    }
}
