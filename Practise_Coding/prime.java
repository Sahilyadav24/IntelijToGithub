package Practise_Coding;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
//        Scanner st = new Scanner(System.in);
//        int num=st.nextInt();
//        for (int i=0;i<=Math.sqrt(num);i++){
//            if(num%i==0){
//                continue;
//            }
//            else {
//                System.out.println(num);
//            }
//        }
        Scanner scanner = new Scanner(System.in);  // Use descriptive variable names

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return; // Exit early for non-positive numbers
        }

        boolean isPrime = true;  // Initialize flag for efficiency

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break; // Exit loop once a divisor is found
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
