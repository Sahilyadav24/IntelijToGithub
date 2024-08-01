package Practise_Coding;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class ListToQueueMerge {
        public static void main(String[] args) {
            // Initialize two ArrayLists
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();

            // Add sample data to the first ArrayList
            list1.add(1);
            list1.add(2);
            list1.add(3);

            // Add sample data to the second ArrayList
            list2.add(4);
            list2.add(5);
            list2.add(6);

            // Merge the two ArrayLists
            List<Integer> mergedList = new ArrayList<>(list1);
            mergedList.addAll(list2);

            // Create a Queue and store the merged values
            Queue<Integer> queue = new LinkedList<>(mergedList);

            // Print the elements of the Queue
            System.out.println("Elements in the Queue:");
            while (!queue.isEmpty()) {
                System.out.print(queue.poll() + " ");
            }
        }


}
