package Practise_Coding;

import java.util.Arrays;

public class Temperature {
    //Question:
//
//You are given an array of n items, where each item has a temperature associated with it. The temperatures can be either positive or negative. Write a Java program to perform the following tasks:
//
//Sort the items in ascending order based on their temperature.
//Segregate the items into two separate arrays: one for items with positive temperatures and one for items with negative temperatures.
//Input:
//An integer n representing the number of items.
//An array of n integers representing the temperatures of the items.
//        Output:
//A sorted array of all items based on their temperature.
//Two arrays: one containing items with positive temperatures and one containing items with negative temperatures.
//        Example:
//Input:
//makefile
//Copy code
//n = 6
//temperatures = [3, -1, 4, -2, 5, -6]
//Output:
//less
//Copy code
//Sorted temperatures: [-6, -2, -1, 3, 4, 5]
//Positive temperatures: [3, 4, 5]
//Negative temperatures: [-6, -2, -1]
//Constraints:
//        1 <= n <= 1000
//        -1000 <= temperatures[i] <= 1000
    public class temperature {
        public static void main(String[] args) {
            int n = 6;
            int []temperatures = {3, -1, 4, -2, 5, -6};

            int[] sortedTemperatures = sortTemperatures(temperatures);
            int[] positiveTemperatures = getPositiveTemperatures(sortedTemperatures);
            int[] negativeTemperatures = getNegativeTemperatures(sortedTemperatures);

            System.out.print("Sorted temperatures: ");
            for (int temp : sortedTemperatures) {
                System.out.print(temp + " ");
            }
            System.out.println();

            System.out.print("Positive temperatures: ");
            for (int temp : positiveTemperatures) {
                System.out.print(temp + " ");
            }
            System.out.println();

            System.out.print("Negative temperatures: ");
            for (int temp : negativeTemperatures) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }

        public static int[] sortTemperatures(int[] sorted) {
            Arrays.sort(sorted);
            return sorted;
        }


        public static int[] getPositiveTemperatures(int[] positive) {
            return Arrays.stream(positive).filter(temperature -> temperature > 0).toArray();
        }

        public static int[] getNegativeTemperatures(int[] negative) {
            // Your implementation here

            return java.util.Arrays.stream(negative).filter(temperature -> temperature < 0).toArray();
        }

    }

}
