package Practise_Coding;
public class FibonacciRecursive {

    public static void main(String[] args) {
        int n = 20; // Number of Fibonacci numbers to print
        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: F(0) = 0, F(1) = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case: F(n) = F(n-1) + F(n-2)
        }
    }
}
