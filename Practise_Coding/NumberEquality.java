package Practise_Coding;

public class NumberEquality {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 15;

        boolean areEqual = checkEquality(num1, num2);
        System.out.println("Numbers are equal: " + areEqual);
    }

    public static boolean checkEquality(int num1, int num2) {
        // Use bitwise XOR to check equality
        return (num1 ^ num2) == 0;
    }
//    public static void main(String[] args) {
//        int num1 = 25;
//        int num2 = 15;
//
//        boolean areEqual = checkEquality(num1, num2);
//        System.out.println("Numbers are equal: " + areEqual);
//    }
//
//    public static boolean checkEquality(int num1, int num2) {
//        // Subtract num2 from num1
//        int difference = num1 - num2;
//
//        // Check if difference is zero
//        return difference == 0;
//    }
}
