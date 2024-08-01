package Practise_Coding;

public class Permutations {

    public static void main(String[] args) {
        String str = "ABCD";
        printPermutations(str, 0, str.length() - 1);
    }

    // Function to print all permutations of a given string
    public static void printPermutations(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                printPermutations(str, left + 1, right);
                str = swap(str, left, i); // backtrack
            }
        }
    }

    // Function to swap characters at position i and j in a string
    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }
}
