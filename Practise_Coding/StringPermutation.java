package Practise_Coding;

import java.util.HashMap;
import java.util.Map;

class StringPermutation {
    public boolean arePermutations(String str1, String str2) {
        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create a frequency map for the first string
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str1.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Decrease frequency based on the second string
        for (char c : str2.toCharArray()) {
            if (!charCountMap.containsKey(c)) {
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
            if (charCountMap.get(c) == 0) {
                charCountMap.remove(c);
            }
        }

        // Check if the map is empty
        return charCountMap.isEmpty();
    }

    public static void main(String[] args) {
        StringPermutation solution = new StringPermutation();
        String str1 = "ABCD";
        String str2 = "DABC";
        boolean result = solution.arePermutations(str1, str2);
        System.out.println("Are the strings permutations of each other? " + result);
    }
}

//package Practise_Coding;
//
//import java.util.Arrays;
//
//public class StringPermutation {
//    public boolean arePermutations(String str1, String str2) {
//        // Check if lengths are different
//        if (str1.length() != str2.length()) {
//            return false;
//        }
//
//        // Convert strings to char arrays and sort them
//        char[] charArray1 = str1.toCharArray();
//        char[] charArray2 = str2.toCharArray();
//        Arrays.sort(charArray1);
//        Arrays.sort(charArray2);
//
//        // Compare sorted char arrays
//        return Arrays.equals(charArray1, charArray2);
//    }
//
//    public static void main(String[] args) {
//        StringPermutation solution = new StringPermutation();
//        String str1 = "ABCD";
//        String str2 = "DABC";
//        boolean result = solution.arePermutations(str1, str2);
//        System.out.println("Are the strings permutations of each other? " + result);
//    }
//}
