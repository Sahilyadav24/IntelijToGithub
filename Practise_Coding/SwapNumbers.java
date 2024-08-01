package Practise_Coding;

public class SwapNumbers {
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 10;
//
//        System.out.println("Before swap: a = " + a + ", b = " + b);
//        swapUsingArithmetic(a, b);
//    }
//
//    public static void swapUsingArithmetic(int a, int b) {
//        // Swap using arithmetic operations
//        a = a + b; // a becomes the sum of a and b
//        b = a - b; // b becomes the original a
//        a = a - b; // a becomes the original b
//
//        System.out.println("After swap: a = " + a + ", b = " + b);
//    }
public static void main(String[] args) {
    int a = 5;
    int b = 10;

    System.out.println("Before swap: a = " + a + ", b = " + b);
    swapUsingXOR(a, b);
}

    public static void swapUsingXOR(int a, int b) {
        // Swap using bitwise XOR
        a = a ^ b; // a becomes a XOR b
        b = a ^ b; // b becomes the original a
        a = a ^ b; // a becomes the original b

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
