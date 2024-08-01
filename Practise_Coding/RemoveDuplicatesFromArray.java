package Practise_Coding;
import java.util.*;
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 4, 2, 3, 5};

        System.out.println("Original Array: " + Arrays.toString(nums));

        int[] result = removeDuplicates(nums);

        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] nums) {
        // Use a HashSet to store unique elements
        Set<Integer> set = new HashSet<>();

        // Traverse through the array and add elements to HashSet
        for (int num : nums) {
            set.add(num);
        }

        // Convert HashSet back to array
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }
}
