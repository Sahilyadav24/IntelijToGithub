package Practise_Coding;
import java.util.Scanner;

public class PalindromeCheck {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();
            scanner.close();

            if (isPalindrome(inputString)) {
                System.out.println(inputString + " is a palindrome.");
            } else {
                System.out.println(inputString + " is not a palindrome.");
            }
        }

        // Function to check if a string is palindrome
        public static boolean isPalindrome(String str) {
            // Initialize pointers
            int left = 0;
            int right = str.length() - 1;

            // Compare characters from start and end towards the center
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false; // Characters do not match, not a palindrome
                }
                left++;
                right--;
            }
            return true; // All characters matched, it is a palindrome
        }


}
