package Practise_Coding;

public class PerfectSquareEvenDigits {
    public static void main(String[] args) {
        for (int number = 1000; number <= 9999; number++) {
            if (allEvenDigits(number) && isPerfectSquare(number)) {
                System.out.println("4-digit perfect square with all even digits: " + number);
                break; // Stop after finding the first number
            }
        }
    }

    // Function to check if all digits of a number are even
    public static boolean allEvenDigits(int number) {
        String numStr = String.valueOf(number);
        for (int i = 0; i < numStr.length(); i++) {
            char digit = numStr.charAt(i);
            if (digit < '0' || digit > '9' || (digit - '0') % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    // Function to check if a number is a perfect square
    public static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }
}
