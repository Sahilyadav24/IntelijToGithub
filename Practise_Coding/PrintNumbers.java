package Practise_Coding;

public class PrintNumbers {
    public static void main(String[] args) {
        printNumbers(1, 20); // Start printing from 1 to 20
    }

    // Recursive method to print numbers from current to max
    public static void printNumbers(int current, int max) {
        if (current > max) {
            return; // Base case: if current exceeds max, stop recursion
        }
        System.out.print(current + " ");
        printNumbers(current + 1, max); // Recursive call with the next number
    }
}
