package Practise_Coding;
import java.util.Arrays;

public class CountTriangles {
    public static void main(String[] args) {
        int[] nums = {4, 3, 7, 5, 10, 9}; // Example array of side lengths

        int count = countTriangles(nums);

        System.out.println("Number of triangles that can be formed: " + count);
    }

    public static int countTriangles(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums); // Sort the array

        int count = 0;

        // Iterate through all triplets (i, j, k) where i < j < k
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Check the triangle inequality condition
                    if (nums[i] + nums[j] > nums[k]) {
                        count++;
                    } else {
                        // Since the array is sorted, further elements won't satisfy the condition
                        break;
                    }
                }
            }
        }

        return count;
    }
}
