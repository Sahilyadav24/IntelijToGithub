package Practise_Coding;

import java.util.Arrays;

public class CountTriangle {
    public int countTriangles(int[] nums) {

        int n = nums.length;
        if (n < 3) return 0;

        Arrays.sort(nums);
        int count = 0;

        for (int i = n - 1; i >= 2; i--) {
            int left = 0, right = i - 1;
            while (left < right) {
                if (nums[left] + nums[right] > nums[i]) {
                    // If nums[left] + nums[right] > nums[i], then all elements from nums[left] to nums[right-1]
                    // will also satisfy the condition with nums[right] and nums[i].
                    count += right - left;
                    right--;
                } else {
                    left++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        CountTriangle solution = new CountTriangle();
        int[] nums = {4, 6, 3, 7};
        int result = solution.countTriangles(nums);
        System.out.println("Number of possible triangles: " + result);
    }
}