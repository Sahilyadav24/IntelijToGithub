package Practise_Coding;

import java.util.Scanner;

public class factorial {
    // Function to calculate factorial
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to calculate its factorial:");
        int number = scanner.nextInt();

        long result = factorial(number);
        System.out.println("The factorial of " + number + " is " + result);
    }
}
